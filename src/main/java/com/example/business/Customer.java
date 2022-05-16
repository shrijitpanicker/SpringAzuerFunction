package com.example.business;

import com.example.common.Constants;
import com.example.common.Helper;
import com.example.common.HttpService;
import com.example.model.CustomerPlan;
import com.microsoft.azure.functions.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;

@Service
public class Customer implements Function<String, CustomerPlan>
{
    @Autowired
    Helper helper;

    @Autowired
    HttpService httpService;

    @Override
    public CustomerPlan apply(String msisdn) {
        if(helper.ValidateMsisdn(msisdn))
        {
            String baseUrl = System.getenv(Constants.MAD_API_V2);
            String url = helper.GetCompleteMadApiUrl(baseUrl, msisdn, Constants.PLANS_URL);
            String xApiKey = System.getenv(Constants.X_API_KEY);
            Map<String, String> headers = Map.of(Constants.X_API_KEY, xApiKey);
            CustomerPlan customerPlan =  httpService.Get(url, CustomerPlan.class, headers, null);

            if(customerPlan.getStatusCode().equalsIgnoreCase("0000"))
            {
                customerPlan.setStatusCode(HttpStatus.OK.toString());
                customerPlan.setStatusMessage("All OK!");
            }
            else {
                customerPlan.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
                customerPlan.setStatusMessage("Error at MAD API");
            }
            return customerPlan;

        }
        else
        {
            CustomerPlan customerPlan = new CustomerPlan();
            customerPlan.setStatusCode(HttpStatus.UNAUTHORIZED.toString());
            customerPlan.setStatusMessage("Invalid phone number. Please enter a correct phone number");
            return customerPlan;
        }
    }
}

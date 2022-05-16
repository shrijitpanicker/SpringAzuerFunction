package com.example.common;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Helper {

    public String GetCompleteMadApiUrl(String baseUrl, String msisdn, String urlEnding)
    {
        String url = baseUrl + msisdn + urlEnding;

        return url;
    }

    public String GetUrlWithParameters(String baseUrl, Map<String, String> parameters)
    {
        String url = baseUrl;
        int count = 0;

        if(parameters != null)
        {
            for(Map.Entry<String, String> parameter : parameters.entrySet()) {
                if(count == 0)
                {
                    url = url + "?" + parameter.getKey() + "=" + parameter.getValue();
                    count = count + 1;
                }
                else
                {
                    url = url + "&" + parameter.getKey() + "=" + parameter.getValue();
                }
            }
        }

        return url;
    }

    public Boolean ValidateMsisdn(String msisdn)
    {
        if(msisdn.length() == 13 && msisdn.substring(0,3).equals(Constants.NIGERIA_COUNTRY_CODE))
        {
            return true;
        }
        else {
            return false;
        }
    }

}

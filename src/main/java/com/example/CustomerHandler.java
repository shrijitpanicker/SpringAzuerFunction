package com.example;

import com.example.model.CustomerPlan;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.BindingName;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

public class CustomerHandler extends FunctionInvoker<String, CustomerPlan> {

    @FunctionName("customer")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request", methods = HttpMethod.GET, authLevel = AuthorizationLevel.ANONYMOUS, route = "customer/{msisdn}/plans") HttpRequestMessage<Optional<String>> request,
                        @BindingName("msisdn") String msisdn,
                        ExecutionContext context) {

        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(msisdn, context))
                .header("Content-Type", "application/json")
                .build();
    }
}

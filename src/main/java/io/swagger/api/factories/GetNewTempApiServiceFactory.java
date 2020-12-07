package io.swagger.api.factories;

import io.swagger.api.GetNewTempApiService;
import io.swagger.api.impl.GetNewTempApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-06T20:20:56.477Z[GMT]")public class GetNewTempApiServiceFactory {
    private final static GetNewTempApiService service = new GetNewTempApiServiceImpl();

    public static GetNewTempApiService getGetNewTempApi() {
        return service;
    }
}

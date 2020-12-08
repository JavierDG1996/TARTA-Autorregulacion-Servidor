package io.swagger.api.factories;

import io.swagger.api.GetNewTempByGroupApiService;
import io.swagger.api.impl.GetNewTempByGroupApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-08T10:42:14.745Z[GMT]")public class GetNewTempByGroupApiServiceFactory {
    private final static GetNewTempByGroupApiService service = new GetNewTempByGroupApiServiceImpl();

    public static GetNewTempByGroupApiService getGetNewTempByGroupApi() {
        return service;
    }
}

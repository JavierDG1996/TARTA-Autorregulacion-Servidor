package io.swagger.api.factories;

import io.swagger.api.ChangeTempApiService;
import io.swagger.api.impl.ChangeTempApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-08T10:42:14.745Z[GMT]")public class ChangeTempApiServiceFactory {
    private final static ChangeTempApiService service = new ChangeTempApiServiceImpl();

    public static ChangeTempApiService getChangeTempApi() {
        return service;
    }
}

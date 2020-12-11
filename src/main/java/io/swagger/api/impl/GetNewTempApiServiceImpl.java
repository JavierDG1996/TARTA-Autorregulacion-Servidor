package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.api.impl.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-08T10:42:14.745Z[GMT]")public class GetNewTempApiServiceImpl extends GetNewTempApiService {
    @Override
    public Response getNewTempEstanciaidGet(String estanciaid, SecurityContext securityContext) throws NotFoundException {
        float newTemp = server.getInstance().calcularTemp(estanciaid);
        String response = "La nueva temperatura a modificar será " + Float.toString(newTemp);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, response)).build();
    }
}

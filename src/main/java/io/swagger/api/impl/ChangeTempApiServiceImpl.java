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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-08T10:42:14.745Z[GMT]")public class ChangeTempApiServiceImpl extends ChangeTempApiService {
    @Override
    public Response changeTempEstanciaidGet(String estanciaid, SecurityContext securityContext) throws NotFoundException {
       
        String response = "";
        
        switch(server.getInstance().changeTemp(estanciaid)){
            case "yes":
            response = "Hay que cambiar la temperatura";
            break;

            case "no":
            response = "No hay que cambiar la temperatura";
            break;

            default:
            response="Algo ha ido mal";
            break;
        }


        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, response)).build();
    }
}

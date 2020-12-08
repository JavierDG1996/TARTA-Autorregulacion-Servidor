package io.swagger.api;


import io.swagger.api.ChangeTempApiService;
import io.swagger.api.factories.ChangeTempApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/changeTemp")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-08T10:42:14.745Z[GMT]")public class ChangeTempApi  {
   private final ChangeTempApiService delegate;

   public ChangeTempApi(@Context ServletConfig servletContext) {
      ChangeTempApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ChangeTempApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ChangeTempApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ChangeTempApiServiceFactory.getChangeTempApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{estanciaid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve si la temperatura debe ser cambiada o no", description = "Al preguntar al servidor si hay que cambiar la temperatura de una sala, este devolverá si hay que cambiarla o no", tags={ "Servidor" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devuelve la respuesta de si la temperatura debe ser cambiada", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Error de conexión entre el controlador y el servidor") })
    public Response changeTempEstanciaidGet(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.changeTempEstanciaidGet(estanciaid,securityContext);
    }
}

package io.swagger.api;


import io.swagger.api.GetNewTempByGroupApiService;
import io.swagger.api.factories.GetNewTempByGroupApiServiceFactory;

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


@Path("/getNewTempByGroup")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-08T10:42:14.745Z[GMT]")public class GetNewTempByGroupApi  {
   private final GetNewTempByGroupApiService delegate;

   public GetNewTempByGroupApi(@Context ServletConfig servletContext) {
      GetNewTempByGroupApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("GetNewTempByGroupApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (GetNewTempByGroupApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = GetNewTempByGroupApiServiceFactory.getGetNewTempByGroupApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{estanciaid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve la temperatura ideal a la que debe cambiar la sala en función de varios usuarios.", description = "El servidor devuelve la temperatura ideal que debe tener la sala, previamente calculada con un algoritmo, para que sea cambiada y cumpla con la satisfacción de todos los usuarios que se encuentran la sala.", tags={ "Servidor" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devuelve la temperatura ideal de la sala", content = @Content(schema = @Schema(implementation = Float.class))),
        
        @ApiResponse(responseCode = "400", description = "Error al obtener la temperatura") })
    public Response getNewTempByGroupEstanciaidGet(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNewTempByGroupEstanciaidGet(estanciaid,securityContext);
    }
}

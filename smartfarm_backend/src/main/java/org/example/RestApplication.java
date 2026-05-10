package org.example;

import jakarta.ws.rs.container.ContainerResponseFilter;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;
import java.net.URI;

public class RestApplication {
    public static final String BASE_URI =
            "http://localhost:8080/api/";
    public static void main(String[] args) {
// On indique à Jersey où se trouvent tes classes Resources
        final ResourceConfig rc = new
                ResourceConfig().packages("org.example.ressources");
        final ResourceConfig server =
                // Autoriser Angular (CORS)
                rc.register((ContainerResponseFilter)
                        (requestContext, responseContext) -> {
                            responseContext.getHeaders().add("Access-Control-Allow-Origin",
                                    "*");
                            responseContext.getHeaders().add("Access-Control-Allow-Headers",
                                    "origin, content-type, accept, authorization");
                            responseContext.getHeaders().add("Access-Control-Allow-Methods",
                                    "GET, POST, PUT, DELETE, OPTIONS, HEAD");
                        });
                GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
        System.out.println(String.format("Serveur SmartFarm démarré sur %s\nAppuyez sur Entrée pour l'arrêter...", BASE_URI));
    }
}

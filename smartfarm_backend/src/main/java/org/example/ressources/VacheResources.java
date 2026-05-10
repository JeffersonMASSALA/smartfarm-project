package org.example.ressources;

import org.smartfarm.models.Vache;
import org.example.GenericRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/vaches") // L'URL sera²

public class VacheResources {
    private GenericRepository<Vache> vacheRepo = new
            GenericRepository<>(Vache.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON) // On renvoie du JSON pour Angular[span_6](end_span)
    public List<Vache> getAllVaches() {
        return vacheRepo.findAll();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Vache addVache(Vache vache) {
        vacheRepo.save(vache);
        return vache;
    }
}
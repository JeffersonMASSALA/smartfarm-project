package org.example.ressources;

import org.smartfarm.models.Alimentation;
import org.example.GenericRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/alimentations")
public class AlimentationResource {
    private GenericRepository<Alimentation> repo = new
            GenericRepository<>(Alimentation.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alimentation> getAll() {
        return repo.findAll();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Alimentation add(Alimentation alimentation) {
        repo.save(alimentation);
        return alimentation;
    }
}

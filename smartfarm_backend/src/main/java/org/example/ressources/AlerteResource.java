package org.example.ressources;

import org.smartfarm.models.Alerte;
import org.example.GenericRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/alertes")

public class AlerteResource {
    private GenericRepository<Alerte> repo = new
            GenericRepository<>(Alerte.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alerte> getAll() {
        return repo.findAll();
    }
}

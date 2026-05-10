package org.example;

import org.smartfarm.models.Vache;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Création du repository générique pour Vache
        GenericRepository<Vache> vacheRepo = new GenericRepository<>(Vache.class);

        // Création d'une nouvelle vache avec le constructeur
        Vache nouvelleVache = new Vache(
                "Marguerite",
                "Prim'Holstein",
                LocalDate.now(),
                "bon",
                550.0
        );

        // Sauvegarde et affichage
        vacheRepo.save(nouvelleVache);
        System.out.println("Succès !");
        vacheRepo.findAll().forEach(v -> System.out.println("Vache : " + v.getNom()));
    }
}

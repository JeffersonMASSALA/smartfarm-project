package org.example.services;

import org.smartfarm.models.*;
import org.example.GenericRepository;
import java.util.List;

public class AnalyseService {
    private GenericRepository<Alerte> alerteRepo = new
            GenericRepository<>(Alerte.class);
    public void verifierAlimentation(Vache vache, List<Alimentation>
            repasRecents) {
        double totalMange = repasRecents.stream()
                .mapToDouble(Alimentation::getQuantite)
                .sum();
// Règle métier : si moins de 10kg par jour
        if (totalMange < 10.0) {
            Alerte alerte = new Alerte();
            alerte.setType("Alimentation insuffisante");
            alerte.setMessage("La vache " + vache.getNom() + " n'a consommé que " + totalMange + "kg");

            alerte.setNiveau("Critique");
            alerte.setVache(vache);
            alerteRepo.save(alerte);
        }
    }
}


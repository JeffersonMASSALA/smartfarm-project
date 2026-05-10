package org.smartfarm.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alimentations")

public class Alimentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;// ex: foin,
    private Double quantite;

    @Column(name = "date_distribution")
    private LocalDate dateDistribution;

    @ManyToOne // Plusieurs alimentations pour une seule vache

    @JoinColumn(name = "vache_id") // La clé étrangère dans la base dedonnées

    private Vache vache;
    public Alimentation() {}
    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public Double getQuantite() { return quantite; }
    public void setQuantite(Double quantite) { this.quantite =
            quantite; }
    public LocalDate getDateDistribution() { return dateDistribution;
    }
    public void setDateDistribution(LocalDate dateDistribution) {
        this.dateDistribution = dateDistribution; }
    public Vache getVache() { return vache; }
    public void setVache(Vache vache) { this.vache = vache; }
}

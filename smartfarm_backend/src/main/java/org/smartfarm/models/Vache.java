package org.smartfarm.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vaches")

public class Vache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;
    private String race;

    @Column(name = "date_naissance")
    private LocalDate dateNaissance;
    @Column(name = "etat_sante")

    private String etatSante;// ex: "bon","malade", "à surveiller"[span_6](end_span)

    private Double poids;
    // --- CONSTRUCTEURS ---
    public Vache() {} // Obligatoire pour JPA
    public Vache(String nom, String race, LocalDate dateNaissance,
                 String etatSante, Double poids) {
        this.nom = nom;
        this.race = race;
        this.dateNaissance = dateNaissance;
        this.etatSante = etatSante;
        this.poids = poids;
    }
    // --- GETTERS ET SETTERS ---
// (Indispensables pour que JAX-RS transforme l'objet en JSON)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getRace() { return race; }
    public void setRace(String race) { this.race = race; }
    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance; }
    public String getEtatSante() { return etatSante; }
    public void setEtatSante(String etatSante) { this.etatSante =
            etatSante; }
    public Double getPoids() { return poids; }
    public void setPoids(Double poids) { this.poids = poids; }
}
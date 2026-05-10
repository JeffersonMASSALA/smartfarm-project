package org.smartfarm.models;

import jakarta.persistence.*;
@Entity
@Table(name = "alertes")

public class Alerte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // ex: santé, alimentation insuffisante
    private String message;
    private String niveau;// ex: faible,

    @ManyToOne

    @JoinColumn(name = "vache_id")

    private Vache vache;
    public Alerte() {}

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public String getNiveau() { return niveau; }
    public void setNiveau(String niveau) { this.niveau = niveau; }
    public Vache getVache() { return vache; }
    public void setVache(Vache vache) { this.vache = vache; }
}

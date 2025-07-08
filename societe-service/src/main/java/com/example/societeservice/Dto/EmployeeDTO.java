package com.example.societeservice.Dto;

public class EmployeeDTO {
    private String id;
    private String nom;
    private String email;

    // ✅ Constructeur par défaut (obligatoire pour Jackson)
    public EmployeeDTO() {
    }

    // ✅ Constructeur avec paramètres
    public EmployeeDTO(String id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // ✅ Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ✅ toString() pour debug Kafka consumer
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

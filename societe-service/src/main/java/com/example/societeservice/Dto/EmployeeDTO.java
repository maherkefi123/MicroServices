package com.example.societeservice.Dto;

public class EmployeeDTO {
    private String id;
    private String nom;
    private String email;

    // Constructor par défaut (no-args)
    public EmployeeDTO() {}
    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

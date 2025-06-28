package com.example.employeeservice.dto;

public class EmployeeSocieteDTO {
    // Infos Employé
    private String employeeId;
    private String name;
    private String job;

    // Infos Societe
    private Long societeId;
    private String societeNom;
    private String societeAdresse;

    // Constructeurs
    public EmployeeSocieteDTO() {}

    public EmployeeSocieteDTO(String employeeId, String name, String job,
                                      Long societeId, String societeNom, String societeAdresse) {
        this.employeeId = employeeId;
        this.name = name;
        this.job = job;
        this.societeId = societeId;
        this.societeNom = societeNom;
        this.societeAdresse = societeAdresse;
    }

    // Getters et Setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    public Long getSocieteId() { return societeId; }
    public void setSocieteId(Long societeId) { this.societeId = societeId; }

    public String getSocieteNom() { return societeNom; }
    public void setSocieteNom(String societeNom) { this.societeNom = societeNom; }

    public String getSocieteAdresse() { return societeAdresse; }
    public void setSocieteAdresse(String societeAdresse) { this.societeAdresse = societeAdresse; }
}


package com.example.employeeservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {
    @Id
    private String id;
    private String name;
    private String job;
    private Long societeId; // ID externe vers Societe

    // Constructeurs
    public Employee() {}
    public Employee(String id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    // Getters et Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }

    public Long getSocieteId() {
        return societeId;
    }

    public void setSocieteId(Long societeId) {
        this.societeId = societeId;
    }
}


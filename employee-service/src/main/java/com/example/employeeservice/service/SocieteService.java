package com.example.employeeservice.service;

import com.example.employeeservice.feign.SocieteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocieteService {

    @Autowired
    private SocieteClient societeClient;

    public String getSocieteDetails(String id) {
        Long societeId = Long.parseLong(id);
        return societeClient.getSocieteById(societeId).getNom();  // ou autre champ selon ce que tu veux
    }
}



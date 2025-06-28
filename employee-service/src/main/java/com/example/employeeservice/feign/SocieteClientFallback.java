package com.example.employeeservice.feign;

import com.example.employeeservice.dto.SocieteDTO;
import org.springframework.stereotype.Component;

@Component
public class SocieteClientFallback implements SocieteClient {

    @Override
    public SocieteDTO getSocieteById(Long id) {
        SocieteDTO fallbackSociete = new SocieteDTO();
        fallbackSociete.setNom("Société inconnue");
        fallbackSociete.setAdresse("Adresse non disponible");
        return fallbackSociete;
    }
}


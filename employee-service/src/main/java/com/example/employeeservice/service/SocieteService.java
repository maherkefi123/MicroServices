package com.example.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SocieteService {

    @Autowired
    private RestTemplate restTemplate;

    public String getSocieteDetails(String societeId) {
        String societeServiceUrl = "http://localhost:8081/societes/" + societeId;
        return restTemplate.getForObject(societeServiceUrl, String.class);
    }
}


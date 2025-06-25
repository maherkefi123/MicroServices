package com.example.employeeservice.service;

import com.example.employeeservice.feign.SocieteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocieteService {

    @Autowired
    private SocieteClient societeClient;

    public String getSocieteDetails(String id) {
        return societeClient.getSocieteById(id);
    }
}

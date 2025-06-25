package com.example.employeeservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "societe-service", url = "http://localhost:8081")
public interface SocieteClient {
    @GetMapping("/societes/{id}")
    String getSocieteById(@PathVariable("id") String id);
}
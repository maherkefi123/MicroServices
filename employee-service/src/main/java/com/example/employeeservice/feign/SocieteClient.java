package com.example.employeeservice.feign;

import com.example.employeeservice.dto.SocieteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "societe-service", url = "http://localhost:8081", fallback = SocieteClientFallback.class
)
public interface SocieteClient {
    @GetMapping("/societes/{id}")
    SocieteDTO getSocieteById(@PathVariable("id") Long id);
}
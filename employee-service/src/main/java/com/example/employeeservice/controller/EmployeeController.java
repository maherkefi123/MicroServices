package com.example.employeeservice.controller;

import com.example.employeeservice.dto.EmployeeSocieteDTO;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import com.example.employeeservice.service.EmployeeService;
import com.example.employeeservice.service.SocieteService;
import com.example.employeeservice.service.EmployeeProducer; // ⬅️ Importe ton Producer Kafka

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private SocieteService societeService;

    @Autowired
    private EmployeeProducer producer;  // ⬅️ Injection du Kafka Producer

    // Ajouter un employé
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // Supprimer un employé
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeRepository.deleteById(id);
    }

    // Test appel à SocieteService via Feign
    @GetMapping("/test-societe/{id}")
    public String testSocieteCall(@PathVariable String id) {
        return societeService.getSocieteDetails(id);
    }

    // Appel Employee + Societe combiné
    @GetMapping("/with-societe/{id}")
    public EmployeeSocieteDTO getEmployeeWithSociete(@PathVariable String id) {
        return employeeService.getEmployeeWithSociete(id);
    }

    // 🟢 NOUVEAU : Endpoint pour envoyer un message Kafka
    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message envoyé via Kafka !");
    }
    @GetMapping("/hello")
    public String hello() {
        return "Bonjour !";
    }
}
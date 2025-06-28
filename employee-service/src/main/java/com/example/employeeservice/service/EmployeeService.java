package com.example.employeeservice.service;

import com.example.employeeservice.dto.EmployeeSocieteDTO;
import com.example.employeeservice.dto.SocieteDTO;
import com.example.employeeservice.feign.SocieteClient;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SocieteClient societeClient;

    public EmployeeSocieteDTO getEmployeeWithSociete(String employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        SocieteDTO societe = societeClient.getSocieteById(employee.getSocieteId());

        return new EmployeeSocieteDTO(
                employee.getId(),
                employee.getName(),
                employee.getJob(),
                societe.getId(),
                societe.getNom(),
                societe.getAdresse()
        );
    }
}

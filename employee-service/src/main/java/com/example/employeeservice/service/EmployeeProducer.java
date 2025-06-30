package com.example.employeeservice.service;

import com.example.employeeservice.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    public EmployeeProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topicName, message); // ✅ OK avec Object
    }

    public void sendEmployee(EmployeeDTO employeeDTO) {
        kafkaTemplate.send(topicName, employeeDTO); // ✅ OK avec Object
    }
}
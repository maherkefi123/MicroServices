package com.example.societeservice.Service;

import com.example.societeservice.Dto.EmployeeDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SocieteConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        System.out.println("🟢 Message reçu : " + message);
        // ici tu peux parser et traiter le message
    }
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(EmployeeDTO employeeDTO) {
        System.out.println("🟢 Employé reçu : " + employeeDTO.getNom());
        // Tu peux ici sauvegarder dans MySQL ou faire autre chose
    }
}

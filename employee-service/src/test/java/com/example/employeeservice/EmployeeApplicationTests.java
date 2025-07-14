package com.example.employeeservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest(properties = {"spring.cloud.config.enabled=false", "spring.kafka.topic.name=employee-topic-test"})
class EmployeeApplicationTests {

    @Test
    void contextLoads() {
    }

}

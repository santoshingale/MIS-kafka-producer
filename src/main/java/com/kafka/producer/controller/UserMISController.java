package com.kafka.producer.controller;

import com.kafka.producer.model.UserMIS;
import com.kafka.producer.repository.UserMISRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/send")
public class UserMISController {

    public static final String TOPIC = "user_log";
    @Autowired
    UserMISRepository userMISRepository;

    @Autowired
    KafkaTemplate<String, UserMIS> kafkaTemplate;

    @GetMapping
    void getMISRecords() {
        List<UserMIS> all = userMISRepository.findAll();

        all.forEach(userMIS -> System.out.println(kafkaTemplate.send(TOPIC, userMIS)));
    }
}

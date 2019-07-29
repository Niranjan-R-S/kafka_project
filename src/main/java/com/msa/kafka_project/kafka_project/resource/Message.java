package com.msa.kafka_project.kafka_project.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class Message {

    @Autowired
    KafkaTemplate<String, String> KafkaTemplate;
    private static final String TOPIC = "follow-leader";

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message") final String message){

        KafkaTemplate.send(TOPIC, message);

        return "Published successfully";
    }

}

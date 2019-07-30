package com.msa.kafka_project.kafka_project.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics="follow-leader", groupId="group_id" )
    public void consume(String message){
        System.out.println("Consumed message: " + message);
    }
}

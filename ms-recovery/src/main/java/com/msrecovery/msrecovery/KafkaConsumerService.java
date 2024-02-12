package com.msrecovery.msrecovery;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.w3c.dom.events.Event;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "msrecovery", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

}


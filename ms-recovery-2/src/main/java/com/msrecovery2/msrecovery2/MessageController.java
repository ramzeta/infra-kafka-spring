package com.msrecovery2.msrecovery2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MessageController {

    private final KafkaProducerService producerService;

    public MessageController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/messages")
    public Mono<Void> sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
        return Mono.empty();
    }
}

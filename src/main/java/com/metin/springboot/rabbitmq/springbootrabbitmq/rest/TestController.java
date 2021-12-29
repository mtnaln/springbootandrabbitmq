package com.metin.springboot.rabbitmq.springbootrabbitmq.rest;

import com.metin.springboot.rabbitmq.springbootrabbitmq.model.Message;
import com.metin.springboot.rabbitmq.springbootrabbitmq.service.PublisherService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    private final PublisherService publisherService;

    public TestController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping("/messages")
    public void sendToQueue(@RequestBody Message message) {
        publisherService.sendToQueue(message);
    }
}

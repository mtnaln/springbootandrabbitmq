package com.metin.springboot.rabbitmq.springbootrabbitmq.service;

import com.metin.springboot.rabbitmq.springbootrabbitmq.model.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    @Value("${rabbitmq.tutorial.routing}")
    private String routing;

    @Value("${rabbitmq.tutorial.exchange}")
    private String exchange;

    private final RabbitTemplate rabbitTemplate;

    public PublisherService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendToQueue(Message message) {
        System.out.println("Send Message Id: " + message.getMessageId());
        rabbitTemplate.convertAndSend(exchange, routing, message);
    }
}

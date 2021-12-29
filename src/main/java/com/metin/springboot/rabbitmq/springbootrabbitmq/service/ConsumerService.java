package com.metin.springboot.rabbitmq.springbootrabbitmq.service;

import com.metin.springboot.rabbitmq.springbootrabbitmq.model.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @RabbitListener(queues = "rabbitmq-tutorial-queue")
    public void consumeMessage(Message message) {
        System.out.println("Coming MessageId: " + message.getMessageId());
        System.out.println("Coming Message Description: " + message.getDescription());
    }
}

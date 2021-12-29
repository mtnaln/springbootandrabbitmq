package com.metin.springboot.rabbitmq.springbootrabbitmq.model;

import java.io.Serializable;

public class Message implements Serializable {

    private final Long messageId;
    private final String description;

    public Message(Long messageId, String description) {
        this.messageId = messageId;
        this.description = description;
    }

    public Long getMessageId() {
        return messageId;
    }

    public String getDescription() {
        return description;
    }
}

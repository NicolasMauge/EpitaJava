package org.example.producer;

import org.springframework.jms.core.MessageCreator;

import javax.jms.*;

public class ChatMessageProducer implements MessageCreator {
    private String messageString;

    public ChatMessageProducer(String messageString) {
        this.messageString = messageString;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        TextMessage message = session.createTextMessage(messageString);
        return message;
    }
}

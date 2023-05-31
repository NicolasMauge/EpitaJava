package com.lafabrique.ERP.producer;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class StockMessageProducer implements MessageCreator {
    private String messageString;

    public StockMessageProducer(String messageString) {
        this.messageString = messageString;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        TextMessage message = session.createTextMessage(messageString);
        return message;
    }
}

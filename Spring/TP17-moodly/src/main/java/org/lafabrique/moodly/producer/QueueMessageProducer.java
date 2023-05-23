package org.lafabrique.moodly.producer;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class QueueMessageProducer implements MessageCreator {
    private String jsonString;

    public QueueMessageProducer(String jsonString) {
        this.jsonString = jsonString;
    }

    @Override
    public Message createMessage(Session session) throws JMSException {
        TextMessage message = session.createTextMessage(jsonString);
        return message;
    }
}

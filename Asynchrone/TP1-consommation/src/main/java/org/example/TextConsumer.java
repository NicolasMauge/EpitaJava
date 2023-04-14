package org.example;

import sun.plugin2.message.TextEventMessage;

import javax.jms.*;
import java.awt.font.TextMeasurer;

public class TextConsumer implements MessageListener {
    public void onMessage(Message message) {
        TextMessage msg = (TextMessage) message;
        try {
            System.out.println((msg.getText()));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}

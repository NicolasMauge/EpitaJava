package org.example;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");
        try {
            Connection connection = factory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            connection.start();
            Destination queue = session.createQueue("queue_EPITA");
            MessageConsumer consumer = session.createConsumer(queue);
            consumer.setMessageListener(new TextConsumer());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
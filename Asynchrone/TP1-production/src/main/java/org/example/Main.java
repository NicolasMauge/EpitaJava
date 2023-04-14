package org.example;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


public class Main {
    public static void main(String[] args) throws JMSException {
        ConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");

        try {
            Connection cnx = factory.createConnection();
            Session session = cnx.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Destination dest = session.createQueue("queue_EPITA");
            MessageProducer producer = session.createProducer(dest);

            TextMessage message = session.createTextMessage("hello !");
            producer.send(message);

            session.close();
            cnx.close();
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }

    }
}
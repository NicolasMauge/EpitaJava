package com.lafabrique.ERP.MQConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MQConsumer {
    @Autowired
    JmsTemplate jmsTemplate;

    @JmsListener(destination = "IAM-ERP")
    public void consume(String message) {
        System.out.println(message);
    }
}

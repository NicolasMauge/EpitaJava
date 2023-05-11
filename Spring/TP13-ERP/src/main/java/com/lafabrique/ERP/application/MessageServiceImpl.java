package com.lafabrique.ERP.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    JmsTemplate jmsTemplate;
    @Override
    public void sendMessage(String message) {
        //jmsTemplate.send("queue-stock", new )


    }
}

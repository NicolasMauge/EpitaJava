package com.example.TP11SpringAsynchroneconso.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MonConsumer {
    @JmsListener(destination = "queue_EPITA")
    public void consume(String message) {
        System.out.println("Je suis Spring..."+message);
    }
}

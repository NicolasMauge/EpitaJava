package org.example.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.domaine.ChatMessage;
import org.example.producer.ChatMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ObjectMapper mapper;

    // + Couche repo

    @Override
    public void sendMessage(String message) {
        jmsTemplate.send("queue-chat", new ChatMessageProducer(message));

        try {
            ChatMessage chatMessage = mapper.readValue(message, ChatMessage.class);
            // + save en db
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @JmsListener(destination = "queue-chat")
    @Override
    public void receive(String message) {
        try {
            ChatMessage chatMessage = mapper.readValue(message, ChatMessage.class);
            System.out.println("---------------------------------\nSender: " + chatMessage.getSender() +
                    "\nTo: " + chatMessage.getRecipient() +
                    "\nContent: " + chatMessage.getContent() + "\n---------------------------------");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}

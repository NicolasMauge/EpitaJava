package org.lafabrique.moodly.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lafabrique.moodly.dto.MoodEntryDto;
import org.lafabrique.moodly.dto.UtilisateurDto;
import org.lafabrique.moodly.producer.QueueMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueueUtilisateurServiceImpl implements QueueUtilisateurService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void sendMessage(String message) {
        jmsTemplate.send("EXN_HBE_moodly", new QueueMessageProducer(message));

        try {
            UtilisateurDto chatMessage = mapper.readValue(message, UtilisateurDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

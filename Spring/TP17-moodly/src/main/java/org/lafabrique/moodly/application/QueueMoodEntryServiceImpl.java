package org.lafabrique.moodly.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lafabrique.moodly.dto.MoodEntryDto;
import org.lafabrique.moodly.producer.QueueMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueueMoodEntryServiceImpl implements QueueMoodEntryService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void sendMessage(String message) {
        jmsTemplate.send("EXN_HBE_moodly", new QueueMessageProducer(message));

        try {
            MoodEntryDto chatMessage = mapper.readValue(message, MoodEntryDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}

package org.lafabrique.moodly.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lafabrique.moodly.dto.ActivityDto;
import org.lafabrique.moodly.producer.QueueMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueueActivityServiceImpl implements QueueActivityService {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void sendMessage(String message) {
        jmsTemplate.send("EXN_HBE_moodly", new QueueMessageProducer(message));

        try {
            ActivityDto chatMessage = mapper.readValue(message, ActivityDto.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

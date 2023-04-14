package org.example.exposition;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.application.ChatService;
import org.example.domaine.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/chatmessage")
public class ChatMessageController {
    @Autowired
    ChatService service;

    @Autowired
    ObjectMapper mapper;

    @GetMapping("/send/")
    public void sendMessage(@RequestBody ChatMessage message) {
        try {
            String json = mapper.writeValueAsString(message);
            service.sendMessage(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

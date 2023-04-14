package org.example.exposition;

import org.example.message.MonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {
    @Autowired
    JmsTemplate jmsTemplate;

    @GetMapping("/send/{message}")
    public void sendMessage(@PathVariable("message") String message) {
        jmsTemplate.send("queue_EPITA", new MonMessage(message));
    }
}

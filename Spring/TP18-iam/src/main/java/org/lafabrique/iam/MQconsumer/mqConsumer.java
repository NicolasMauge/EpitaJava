package org.lafabrique.iam.MQconsumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.lafabrique.iam.application.ClientService;
import org.lafabrique.iam.domaine.Client;
import org.lafabrique.iam.domaine.MQPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class mqConsumer {
    @Autowired
    ClientService clientService;
    @Autowired
    JmsTemplate jmsTemplate;

    @JmsListener(destination = "ERP-IAM")
    public void consume(String message) {
        ObjectMapper mapper = new ObjectMapper();
        MQPayload payload = null;
        try {
            payload = mapper.readValue(message, MQPayload.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println("payloadIn: "+payload.getBlocType()+","+payload.getClientId());

        if (payload.getBlocType().equals("1")) {
            Client client = clientService.findById(payload.getClientId());

            // client à convertir en Dto spécial sans mdp

            String payloadOut;

            ObjectMapper mapper2 = new ObjectMapper();

            try {
                payloadOut = mapper.writeValueAsString(client);
            } catch (JsonMappingException e) {
                throw new RuntimeException(e);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

            System.out.println("message envoyé : "+ payloadOut);

            jmsTemplate.send("IAM-ERP", session -> session.createTextMessage(payloadOut));
        }
        //System.out.println("client: "+client.getEmail()+" "+client.getRoles());
        //System.out.println(""+payload.getBlocType()+","+payload.getClientId());


    }
}

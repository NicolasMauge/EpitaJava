package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.ClientService;
import com.lafabrique.ERP.converter.ClientConverter;
import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.dto.ClientDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClientController {
    @Autowired
    ClientService clientService;

    @Autowired
    JmsTemplate jmsTemplate;

    @PostMapping("/client")
    void createClient(@RequestBody ClientDetailDto dto) {
        Client client = ClientConverter.convertClientDetailDtoToClientEntity(dto);
        clientService.create(client);
    }

    @GetMapping("/client/{id}")
    ClientDetailDto findClientById(@PathVariable("id") Long id) {
        String payload = "{\"blocType\":\"1\"," + "\"clientId\":\""+id+"\"}";
        jmsTemplate.send("ERP-IAM", session -> session.createTextMessage(payload));
        return null;
        //return ClientConverter.convertClientEntityToClientDetailDto(clientService.findById(id));
    }

    @GetMapping("/clients")
    List<Client> findAll(){
        return clientService.findAll();
    }
}

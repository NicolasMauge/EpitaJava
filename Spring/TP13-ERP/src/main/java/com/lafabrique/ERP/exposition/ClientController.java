package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.ClientService;
import com.lafabrique.ERP.converter.ClientConverter;
import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.dto.ClientDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/client")
    void createClient(@RequestBody ClientDetailDto dto) {
        Client client = ClientConverter.convertClientDetailDtoToClientEntity(dto);
        clientService.create(client);
    }

    @GetMapping("/client/{id}")
    ClientDetailDto findClientById(@PathVariable("id") Long id) {
        return ClientConverter.convertClientEntityToClientDetailDto(clientService.findById(id));
    }

    @GetMapping("/clients")
    List<Client> findAll(){
        return clientService.findAll();
    }
}

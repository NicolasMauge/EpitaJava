package com.example.Ex5ERP.exposition;

import com.example.Ex5ERP.application.Client;
import com.example.Ex5ERP.application.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ERP {
    @Autowired
    ClientService service;

    @PostMapping
    void create(@RequestBody Client c) {
        service.nouveauClient(c);
    }

    @GetMapping("/all")
    public List<Client> getClients() {
        return service.getClients();
    }

}

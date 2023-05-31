package org.lafabrique.iam.exposition;

import org.lafabrique.iam.application.ClientService;
import org.lafabrique.iam.converter.ClientConverter;
import org.lafabrique.iam.domaine.Client;
import org.lafabrique.iam.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/iam")
public class ClientController {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    ClientService clientService;

    @PostMapping("/create")
    public void createClient(@RequestBody ClientDto clientDto) {
        Client client = ClientConverter.convertClientDtoToClientEntity(clientDto);

        String encryptedPassword = passwordEncoder.encode(client.getPassword());
        client.setPassword(encryptedPassword);

        System.out.println("password: " + encryptedPassword);

        clientService.createClient(client);
    }
}

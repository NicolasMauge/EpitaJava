package com.example.Ex5ERP.application;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private List<Client> clients = new ArrayList<>();
    @Override
    public List<Client> getClients() {
        for(Client c:clients) {
            System.out.println(c);
        }
        return clients;
    }

    @Override
    public void nouveauClient(Client client) {
        //System.out.println(client);
        clients.add(client);
    }
}

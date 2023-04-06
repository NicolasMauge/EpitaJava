package com.example.Ex5ERP.application;

import java.util.List;

public interface ClientService {
    List<Client> getClients();

    void nouveauClient(Client client);
}

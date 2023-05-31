package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Client;

import java.util.List;

public interface ClientService {
    List<Client> findBySurname(String surname);

    List<Client> findAll();

    void create(Client client);

    Client findById(Long id);
}

package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findBySurname(String surname) {
        return clientRepository.findBySurname(surname);
    }

    @Override
    public void create(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        if (!clientOptional.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return clientOptional.get();
        }
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

}

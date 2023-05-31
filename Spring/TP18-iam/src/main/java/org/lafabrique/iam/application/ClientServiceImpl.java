package org.lafabrique.iam.application;

import org.lafabrique.iam.domaine.Client;
import org.lafabrique.iam.infrastructure.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    Repository repository;

    @Override
    public Client findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> clientOptional = repository.findById(id);
        if (!clientOptional.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return clientOptional.get();
        }
    }

    @Override
    public void createClient(Client client) {
        repository.save(client);
    }
}

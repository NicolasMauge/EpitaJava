package org.lafabrique.iam.application;

import org.lafabrique.iam.domaine.Client;

public interface ClientService {
    Client findByEmail(String email);

    Client findById(Long id);

    void createClient(Client client);
}

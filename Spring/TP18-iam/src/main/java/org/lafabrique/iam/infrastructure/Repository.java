package org.lafabrique.iam.infrastructure;

import org.lafabrique.iam.domaine.Client;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);
}

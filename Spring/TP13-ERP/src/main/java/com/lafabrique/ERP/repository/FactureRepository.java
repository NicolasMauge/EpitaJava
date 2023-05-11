package com.lafabrique.ERP.repository;

import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.domaine.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
    List<Facture> findByClient(Client client);

    List<Facture> findAll();
}

package com.lafabrique.ERP.repository;

import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.domaine.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long> {
    List<Devis> findByClient(Client client);
}

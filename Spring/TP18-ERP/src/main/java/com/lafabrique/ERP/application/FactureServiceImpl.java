package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Facture;
import com.lafabrique.ERP.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class FactureServiceImpl implements FactureService {
    @Autowired
    FactureRepository factureRepository;

    @Override
    public void create(Facture facture) {
        factureRepository.save(facture);
    }

    @Override
    public Facture findById(Long id) {
        Optional<Facture> factureOptional = factureRepository.findById(id);
        if (!factureOptional.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return factureOptional.get();
        }
    }

    @Override
    public List<Facture> findAll() {
        return factureRepository.findAll();
    }
}

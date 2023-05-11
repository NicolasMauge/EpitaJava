package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Devis;
import com.lafabrique.ERP.repository.DevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class DevisServiceImpl implements DevisService {
    @Autowired
    DevisRepository devisRepository;

    @Override
    public void create(Devis devis) {
        devisRepository.save(devis);
    }

    @Override
    public Devis findById(Long id) {
        Optional<Devis> devisOptional = devisRepository.findById(id);
        if (!devisOptional.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return devisOptional.get();
        }
    }

    @Override
    public List<Devis> findAll() {
        return devisRepository.findAll();
    }


}

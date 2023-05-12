package com.lafabrique.ERP.application;

import com.lafabrique.ERP.domaine.Produit;
import com.lafabrique.ERP.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public void create(Produit produit) {
        produitRepository.save(produit);
    }

    @Override
    public Produit findById(Long id) {
        Optional<Produit> produitOptional = produitRepository.findById(id);
        if (!produitOptional.isPresent()) {
            throw new EntityNotFoundException();
        } else {
            return produitOptional.get();
        }
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> findAll(Sort sort) {
        return produitRepository.findAll(sort);
    }
}

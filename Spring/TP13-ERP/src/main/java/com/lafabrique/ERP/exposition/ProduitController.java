package com.lafabrique.ERP.exposition;

import com.lafabrique.ERP.application.ProduitService;
import com.lafabrique.ERP.converter.ProduitConverter;
import com.lafabrique.ERP.domaine.Produit;
import com.lafabrique.ERP.dto.ProduitMinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class ProduitController {
    @Autowired
    ProduitService produitService;

    @Autowired
    ProduitConverter converter;

    @PostMapping("/produit")
    void createProduit(@RequestBody Produit produit){
        produitService.create(produit);
    }

    @GetMapping("/produit/{id}")
    Produit findProduitById(@PathVariable("id") Long id){
        return produitService.findById(id);
    }

    @GetMapping("/all/{property}/{order}")
    List<ProduitMinDto> findAllSort(@PathVariable("property") String property, @PathVariable("order") String order) {
        //List<Produit> sortedList = produitService.findAll(order.equals("D") ? Sort.by(property).descending() : Sort.by("proerty").ascending());
        Sort s = null;
        if(order.equals("A")){
            s = Sort.by(property).ascending();
        } else {
            s = Sort.by(property).descending();
        }

        List<Produit> sortedList = produitService.findAll(s);
        List<ProduitMinDto> listDto = sortedList
                .stream()
                .map((produit -> converter.convertProduitEntityToProduitMinDto(produit)))
                .collect(Collectors.toList());

        return listDto;
    }
}

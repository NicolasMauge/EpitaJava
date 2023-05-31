package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.application.Compute;
import com.lafabrique.ERP.domaine.Produit;
import com.lafabrique.ERP.dto.ProduitDetailDto;
import com.lafabrique.ERP.dto.ProduitMinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProduitConverter {
    @Autowired
    Compute compute;

    public static ProduitDetailDto convertProduitEntityToProduitDetailDto(Produit produit) {
        ProduitDetailDto produitDetailDto = new ProduitDetailDto();

        Optional.ofNullable(produit).ifPresent((p) -> {
                    produitDetailDto.setDescription(p.getDescription());
                    produitDetailDto.setId(p.getId());
                    produitDetailDto.setName(p.getName());
                    produitDetailDto.setPhoto(p.getPhoto());
                    produitDetailDto.setPrice(p.getPrice());
                }
        );

        return produitDetailDto;
    }

    public static Produit convertProduitDetailDtoToProduitEntity(ProduitDetailDto produitDetailDto) {
        Produit produit = new Produit();

        Optional.ofNullable(produitDetailDto).ifPresent((p) -> {
            produit.setDescription(p.getDescription());
            produit.setId(p.getId());
            produit.setName(p.getName());
            produit.setPhoto(p.getPhoto());
            produit.setPrice(p.getPrice());
                }
        );

        return produit;
    }

    public ProduitMinDto convertProduitEntityToProduitMinDto(Produit produit) {
        ProduitMinDto dto = new ProduitMinDto();
        dto.setId(produit.getId());
        dto.setName(produit.getName());
        dto.setPrice(produit.getPrice());
        dto.setPhoto(produit.getPhoto());
        dto.setPriceVAT(compute.calculPriceVAT(produit.getPrice()));

        // Ou
        //ModelMapper mapper = new ModelMapper();
        //ProduitMinDto produitMinDto = mapper.map();
        return dto;
    }
}

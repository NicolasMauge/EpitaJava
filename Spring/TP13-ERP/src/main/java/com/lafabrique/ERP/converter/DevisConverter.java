package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.domaine.Devis;
import com.lafabrique.ERP.domaine.LigneDevis;
import com.lafabrique.ERP.dto.ClientDetailDto;
import com.lafabrique.ERP.dto.DevisDetailDto;
import com.lafabrique.ERP.dto.LigneDevisDto;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class DevisConverter {
    public static DevisDetailDto convertDevisEntityToDevisDetailDto(Devis devis) {
        ClientDetailDto client;
        DevisDetailDto devisDetailDto = new DevisDetailDto();

        Optional.ofNullable(devis).ifPresent((d) -> {
                    devisDetailDto.setId(d.getId());
                }
        );

        Optional.ofNullable(devis.getClient()).ifPresent((c) -> {
                    devisDetailDto.setClientDetailDto(ClientConverter.convertClientEntityToClientDetailDto(c));
                }
        );

        Optional.ofNullable(devis.getLigneDevis()).ifPresent((l) -> {
                    Set<LigneDevisDto> ligneDevisDtoSet = new HashSet<LigneDevisDto>();

                    for (LigneDevis ligne : l) {
                        LigneDevisDto ligneDevisDto = new LigneDevisDto();

                        ligneDevisDto.setProduitDetailDto(ProduitConverter.convertProduitEntityToProduitDetailDto(ligne.getProduit()));
                        ligneDevisDto.setQuantity(ligne.getQuantity());

                        ligneDevisDtoSet.add(ligneDevisDto);
                    }

                    devisDetailDto.setLigneDevisDto(ligneDevisDtoSet);
                }
        );

        return devisDetailDto;
    }
}

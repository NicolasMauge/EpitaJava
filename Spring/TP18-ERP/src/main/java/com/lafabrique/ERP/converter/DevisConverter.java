package com.lafabrique.ERP.converter;

import com.lafabrique.ERP.application.Compute;
import com.lafabrique.ERP.domaine.Client;
import com.lafabrique.ERP.domaine.Devis;
import com.lafabrique.ERP.domaine.LigneDevis;
import com.lafabrique.ERP.dto.ClientDetailDto;
import com.lafabrique.ERP.dto.DevisDetailDto;
import com.lafabrique.ERP.dto.DevisMinDto;
import com.lafabrique.ERP.dto.LigneDevisDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class DevisConverter {
    @Autowired
    Compute compute;

    public Devis convertDevisDetailDtoToDevisEntity(DevisDetailDto dto) {
        Devis devis = new Devis();
        devis.setDate(dto.getDate());

        Client client = ClientConverter.convertClientDetailDtoToClientEntity(dto.getClientDetailDto());
        devis.setClient(client);

        Set<LigneDevis> lignes = dto.getLigneDevisDto()
                .stream()
                .map(ligneDevisDto -> convertLigneDtoToLigneDevis(ligneDevisDto))
                .collect(Collectors.toSet());

        devis.setLigneDevis(lignes);

        return devis;
    }

    public DevisDetailDto convertDevisEntityToDevisDetailDto(Devis devis) {
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

    public DevisMinDto convertDevisEntityToDevisMinDto(Devis devis) {
        return null;
    }

    public LigneDevis convertLigneDtoToLigneDevis(LigneDevisDto ligneDevisDto) {
        LigneDevis ligneDevis = new LigneDevis();
        ligneDevis.setQuantity(ligneDevisDto.getQuantity());
        ligneDevis.setProduit(ProduitConverter.convertProduitDetailDtoToProduitEntity(ligneDevisDto.getProduitDetailDto()));
        ligneDevis.setRemise(ligneDevisDto.getRemise());

        return ligneDevis;
    }
}

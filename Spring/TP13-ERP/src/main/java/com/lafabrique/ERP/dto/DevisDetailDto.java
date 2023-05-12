package com.lafabrique.ERP.dto;

import com.lafabrique.ERP.domaine.Client;
import java.util.Set;

public class DevisDetailDto {
    private Long id;
    private ClientDetailDto clientDetailDto;
    private Set<LigneDevisDto> ligneDevisDto;

    public DevisDetailDto(Long id, ClientDetailDto clientDetailDto, Set<LigneDevisDto> ligneDevisDto) {
        this.id = id;
        this.clientDetailDto = clientDetailDto;
        this.ligneDevisDto = ligneDevisDto;
    }

    public DevisDetailDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientDetailDto getClientDetailDto() {
        return clientDetailDto;
    }

    public void setClientDetailDto(ClientDetailDto clientDetailDto) {
        this.clientDetailDto = clientDetailDto;
    }

    public Set<LigneDevisDto> getLigneDevisDto() {
        return ligneDevisDto;
    }

    public void setLigneDevisDto(Set<LigneDevisDto> ligneDevisDto) {
        this.ligneDevisDto = ligneDevisDto;
    }
}

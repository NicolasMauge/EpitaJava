package com.lafabrique.ERP.dto;

import com.lafabrique.ERP.domaine.Client;

import java.time.LocalDate;
import java.util.Set;

public class DevisDetailDto extends DevisMinDto {
    private Set<LigneDevisDto> ligneDevisDto;

    public DevisDetailDto(Set<LigneDevisDto> ligneDevisDto) {
        this.ligneDevisDto = ligneDevisDto;
    }

    public DevisDetailDto() {
    }

    public Set<LigneDevisDto> getLigneDevisDto() {
        return ligneDevisDto;
    }

    public void setLigneDevisDto(Set<LigneDevisDto> ligneDevisDto) {
        this.ligneDevisDto = ligneDevisDto;
    }
}

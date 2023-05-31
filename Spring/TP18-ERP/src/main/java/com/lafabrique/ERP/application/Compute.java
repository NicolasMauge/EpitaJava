package com.lafabrique.ERP.application;

import com.lafabrique.ERP.dto.LigneDevisDto;

import java.math.BigDecimal;
import java.util.Set;

public interface Compute {
    BigDecimal calculPriceVAT(BigDecimal price);

    BigDecimal calculTotal(Set<LigneDevisDto> ligneDevisDtoSet);
}

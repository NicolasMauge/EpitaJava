package com.lafabrique.ERP.application;

import com.lafabrique.ERP.Util.ConstantUtil;
import com.lafabrique.ERP.dto.LigneDevisDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Set;

@Component
public class ComputeImpl implements Compute {
    @Override
    public BigDecimal calculPriceVAT(BigDecimal price) {
        return price.multiply(new BigDecimal(ConstantUtil.ERP_TAX_RATE));
    }

    @Override
    public BigDecimal calculTotal(Set<LigneDevisDto> ligneDevisDtoSet) {
        return ligneDevisDtoSet
                .stream()
                .map(ligneDevisDto -> ligneDevisDto.getMontant())
                .reduce(BigDecimal::add).get();
    }
}

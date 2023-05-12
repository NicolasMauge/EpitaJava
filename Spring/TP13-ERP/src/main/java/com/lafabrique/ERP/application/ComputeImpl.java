package com.lafabrique.ERP.application;

import com.lafabrique.ERP.Util.ConstantUtil;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ComputeImpl implements Compute {
    @Override
    public BigDecimal calculPriceVAT(BigDecimal price) {
        return price.multiply(new BigDecimal(ConstantUtil.ERP_TAX_RATE));
    }
}

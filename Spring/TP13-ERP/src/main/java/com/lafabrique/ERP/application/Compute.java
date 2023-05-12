package com.lafabrique.ERP.application;

import java.math.BigDecimal;

public interface Compute {
    BigDecimal calculPriceVAT(BigDecimal price);
}

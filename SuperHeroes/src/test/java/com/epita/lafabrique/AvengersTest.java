package com.epita.lafabrique;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AvengersTest {
    private static final int AGE_MINEUR = 17;

    @Test
    public void should_SpiderMan_est_mineur() {
        assertThat(SuperHeroList.spiderman.getAge()).isLessThanOrEqualTo(AGE_MINEUR);
    }

    @Test
    public void should_BlackWidow_is_avengers(){
        assertThat(SuperHeroList.blackWidow).isIn(SuperHeroList.avengers);
    }
}

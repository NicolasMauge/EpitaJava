package com.epita.lafabrique;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AvengersTest {
    private static final int AGE_MINEUR = 17;


    @Test
    public void test_should_SpiderMan_est_mineur() {
        assertThat(SuperHeroList.spiderman.getAge()).isLessThanOrEqualTo(AGE_MINEUR);
    }

    @Test
    public void test_should_BlackWidow_is_avengers() {
        assertThat(SuperHeroList.blackWidow).isIn(SuperHeroList.avengers);
    }

    @Test
    public void test_should_list_superhero_no_duplicates() {
        assertThat(SuperHeroList.avengers).doesNotHaveDuplicates();
    }

    @Test
    public void test_should_Thanos_not_avenger() {
        assertThat(SuperHeroList.avengers).doesNotContain(SuperHeroList.thanos);
    }

    @Test
    public void test_should_Thor_have_null_superhero_name() {
        assertThat(SuperHeroList.thor.getSuperHeroName()).isNull();
    }

    @Test
    public void test_should_Thanos_have_null_superhero_name() {
        assertThat(SuperHeroList.thanos.getSuperHeroName()).isNull();
    }

    @DisplayName("Thanos should have at least all the power of Hulk")
    @Test
    public void test_should_Thanos_have_at_least_hulk_power() {
        assertThat(SuperHeroList.thanos.getPowers()).containsAll(SuperHeroList.hulk.getPowers());
    }

    @Test
    public void test_should_haweye_be_a_superhero() {
        assertThat(SuperHeroList.hawkEye).isInstanceOf(SuperHero.class);
    }


}

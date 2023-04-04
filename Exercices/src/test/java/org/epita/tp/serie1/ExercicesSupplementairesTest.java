package org.epita.tp.serie1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ExercicesSupplementairesTest {
    @Test
    public void test_ex1_should_return_sum_square_of_elements() {
        assertThat(ExercicesSupplementaires.exercice1(1, 2, 3)).isEqualTo(14);
    }

    @Test
    public void test_ex1_should_return_sum_square_of_elements_even_with_negatives() {
        assertThat(ExercicesSupplementaires.exercice1(14, 9, -9, 1, 4, 3)).isEqualTo(384);
    }

    @Test
    public void test_ex1_should_return_minus_1_for_empty() {
        assertThat(ExercicesSupplementaires.exercice1()).isEqualTo(-1);
    }

    @Test
    public void test_ex2_should_return_mean_of_2_val() {
        float[] decimaux = {10.0f, 20.0f};
        assertThat(ExercicesSupplementaires.exercice2(decimaux)).isEqualTo(15);
    }

    @Test
    public void test_ex2_should_return_mean_of_n_val() {
        float[] decimaux = {11, 12, 13, 14, 15, 16};
        assertThat(ExercicesSupplementaires.exercice2(decimaux)).isEqualTo(13);
    }

    @Test
    public void test_ex2_should_throw_Exc_is_empty() {
        float[] decimaux = {};
        Throwable throwEx = catchThrowable(() -> ExercicesSupplementaires.exercice2(decimaux));
        assertThat(throwEx).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void test_ex3_should_return_most_distant_number_of_0() {
        long[] entiers = {1, -2, 10, -15, 3};
        assertThat(ExercicesSupplementaires.exercice3(entiers)).isEqualTo(3);
    }

    @Test
    public void test_ex3_should_return_positive_number_if_egality() {
        long[] entiers = {-10, 10, 3, -5};
        assertThat(ExercicesSupplementaires.exercice3(entiers)).isEqualTo(1);
    }

    @Test
    public void test_ex4_f0_plus_f1_equal_f2() {
        assertThat(ExercicesSupplementaires.exercice4(0) + ExercicesSupplementaires.exercice4(1)).isEqualTo(ExercicesSupplementaires.exercice4(2));
    }

    @Test
    public void test_ex4_f9_plus_f8_equal_55() {
        assertThat(ExercicesSupplementaires.exercice4(9) + ExercicesSupplementaires.exercice4(8)).isEqualTo(55);
    }

    @Test
    public void test_ex4_f16_equal_987() {
        assertThat(ExercicesSupplementaires.exercice4(16)).isEqualTo(987);
    }

    @Test
    public void test_ex4_f80_23416728348467685() {
        assertThat(ExercicesSupplementaires.exercice4(80)).isEqualTo(23416728348467685L);
    }

    @Test
    public void test_ex5_should_return_true_if_21yo_9on10_salary_60000() {
        assertThat(ExercicesSupplementaires.exercice5(21, 9, 60000)).isEqualTo(true);
    }

    @Test
    public void test_ex5_should_return_false_if_21yo_7on10_salary_90000() {
        assertThat(ExercicesSupplementaires.exercice5(21, 7, 90000)).isEqualTo(false);
    }

    @Test
    public void test_ex5_should_return_true_if_90yo_2on10_salary_2000000() {
        assertThat(ExercicesSupplementaires.exercice5(90, 2, 2000000)).isEqualTo(true);
    }

    @Test
    public void test_ex6_should_only_show_last_4_char_else_sharp() {
        assertThat(ExercicesSupplementaires.exercice6("123456789012")).isEqualTo("########9012");
    }

    @Test
    public void test_ex6_should_return_sharponne_personne() {
        assertThat(ExercicesSupplementaires.exercice6("MomNomEstPersonne")).isEqualTo("#############onne");
    }

    @Test
    public void test_ex6_should_return_42_for_42() {
        assertThat(ExercicesSupplementaires.exercice6("42")).isEqualTo("42");
    }

    @Test
    public void test_ex7_return_toto_for_Toto() {
        assertThat(ExercicesSupplementaires.exercice7("Toto")).isEqualTo("toto");
    }

    @Test
    public void test_ex7_return_TITi_for_TITI() {
        assertThat(ExercicesSupplementaires.exercice7("TITi")).isEqualTo("TITI");
    }

    @Test
    public void test_ex7_return_taTA_for_taTA() {
        assertThat(ExercicesSupplementaires.exercice7("taTA")).isEqualTo("taTA");
    }

    @Test
    public void test_ex8_should_return_6_for_1_2_3() {
        int[] numbers = {1,2,3};
        assertThat(ExercicesSupplementaires.exercice8(numbers)).isEqualTo(6);
    }

    @Test
    public void test_ex8_should_return_50() {
        int[] numbers = {9, 5, 10, 2, 24, -1, -48};
        assertThat(ExercicesSupplementaires.exercice8(numbers)).isEqualTo(50);
    }

    @Test
    public void test_ex8_should_return_minus_14() {
        int[] numbers = {-23, 4, -5, 99, -27, 329, -2, 7, -921};
        assertThat(ExercicesSupplementaires.exercice8(numbers)).isEqualTo(-14);
    }

    @Test
    public void test_ex9_should_return_13_for_1_3_1() {
        int[] numbers = {1, 3, 1};
        assertThat(ExercicesSupplementaires.exercice9(numbers)).isEqualTo(13);
    }

    @Test
    public void test_ex9_should_return_579() {
        int[] numbers = {5, 7, 5, 9, 7};
        assertThat(ExercicesSupplementaires.exercice9(numbers)).isEqualTo(579);
    }

    @Test
    public void test_ex9_should_return_134679() {
        int[] numbers = {9, 1, 3, 1, 7, 4, 6, 6, 7};
        assertThat(ExercicesSupplementaires.exercice9(numbers)).isEqualTo(134679);
    }
    @Test
    public void test_ex10_should_return_234_for_1234_and_comma1() {
        assertThat(ExercicesSupplementaires.exercice10("1234",1)).isEqualTo(234);
    }

    @Test
    public void test_ex10_should_return_34_for_1234_and_comma2() {
        assertThat(ExercicesSupplementaires.exercice10("1234",2)).isEqualTo(34);
    }

    @Test
    public void test_ex11_should_return_false_0_0_0_50() {
        assertThat(ExercicesSupplementaires.exercice11(0,0,0,50)).isEqualTo(false);
    }

    @Test
    public void test_ex11_should_return_false_2_2_2_50() {
        assertThat(ExercicesSupplementaires.exercice11(2,2,2,200)).isEqualTo(false);
    }

    @Test
    public void test_ex11_should_return_true_1_2_2_10() {
        assertThat(ExercicesSupplementaires.exercice11(1,2,2,10)).isEqualTo(true);
    }

    @Test
    public void test_ex11_should_return_true_1_2_2_90() {
        assertThat(ExercicesSupplementaires.exercice11(1,2,2,90)).isEqualTo(true);
    }

    @Test
    public void test_ex11_should_return_false_0_2_5_80() {
        assertThat(ExercicesSupplementaires.exercice11(0,2,5,80)).isEqualTo(false);
    }

}

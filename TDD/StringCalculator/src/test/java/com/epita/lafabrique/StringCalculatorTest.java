package com.epita.lafabrique;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class StringCalculatorTest {
    @Test
    public void test_should_return_the_number_if_only_number(){
        assertThat(StringCalculator.calculator("1")).isEqualTo("1");
    }

    @Test
    public void test_should_return_sum_a_b_if_given_a_comma_b(){
        assertThat(StringCalculator.calculator("1,2")).isEqualTo("3");
    }

    @Test
    public void test_should_return_0_is_empty_string(){
        assertThat(StringCalculator.calculator("")).isEqualTo("0");
    }

}

package com.epita.lafabrique;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.epita.lafabrique.FizzBuzz;
import com.epita.lafabrique.MonException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.lang.Throwable;

public class FizzBuzzTest {

    @Test
    public void test_should_return_a_number_in_string(){
        try{
            assertThat(FizzBuzz.fizz(4)).isEqualTo("4");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_return_FIZZ_if_divisible_by_3(){
        try{
            assertThat(FizzBuzz.fizz(6)).isEqualTo("FIZZ");
        } catch (MonException e) {

        }
    }

    @Test
    @Disabled
    public void test_should_return_BUZZ_if_divisible_by_5(){
        try {
            assertThat(FizzBuzz.fizz(5)).isEqualTo("BUZZ");
        } catch (MonException e) {

        }
    }

    @Test
    @Disabled
    public void test_should_return_FIZZBUZZ_if_divisible_by_3_and_5(){
        try {
            assertThat(FizzBuzz.fizz(15)).isEqualTo("FIZZBUZZ");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_return_exception_if_negative_value(){
        Throwable throwsError = catchThrowable(()-> FizzBuzz.fizz(-7));
        assertThat(throwsError).isInstanceOf(MonException.class);
    }

    @Test
    public void test_should_return_QIX_if_divisible_by_7(){
        try {
            assertThat(FizzBuzz.fizz(14)).isEqualTo("QIX");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_return_FIZZQIX_if_divisible_by_7_and_3(){
        try {
            assertThat(FizzBuzz.fizz(21)).isEqualTo("FIZZQIX");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_add_BUZZ_at_the_end_if_contains_5(){
        try {
            assertThat(FizzBuzz.fizz(15)).isEqualTo("FIZZBUZZBUZZ");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_add_FIZZ_at_the_end_if_contains_3(){
        try {
            assertThat(FizzBuzz.fizz(33)).isEqualTo("FIZZFIZZFIZZ");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_add_QIX_at_the_end_if_contains_7(){
        try {
            assertThat(FizzBuzz.fizz(17)).isEqualTo("QIX");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_replace_0_by_star(){
        try {
            assertThat(FizzBuzz.fizz(101)).isEqualTo("1*1");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_replace_0_by_star_2(){
        try {
            assertThat(FizzBuzz.fizz(303)).isEqualTo("FIZZFIZZ*FIZZ");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_replace_0_by_star_3(){
        try {
            assertThat(FizzBuzz.fizz(105)).isEqualTo("FIZZBUZZQIX*BUZZ");
        } catch (MonException e) {

        }
    }

    @Test
    public void test_should_replace_0_by_star_4(){
        try {
            assertThat(FizzBuzz.fizz(10101)).isEqualTo("FIZZQIX**");
        } catch (MonException e) {

        }
    }

}

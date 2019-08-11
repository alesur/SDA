package com.alexs.mavendemo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SubtractTest {

    Calculator calc = new Calculator();
    @Test

    public void subtract_Two_Positive_Values_equals_positive() {
        // given
        int firstNum = 50;
        int secondNum = 4;

        //input data
        int result = calc.multiply(firstNum, secondNum);
        //then
        assertEquals(200, result);
    }

    @Test
    public void subtract_Two_Negative_Values_equals_positive() {
        // given
        int firstNum = -50;
        int secondNum = -4;

        //input data
        int result = calc.multiply(firstNum, secondNum);
        //then
        assertEquals(200, result);
    }
    @Test
    public void subtract_one_positive_one_negative_equals_negative() {
        // given
        int firstNum = -50;
        int secondNum = 4;

        //input data
        int result = calc.multiply(firstNum, secondNum);
        //then
        assertEquals(-200, result);
    }
    @Test
    public void Subtract_Two_Zeroes_Equals_Zero() {
        // given
        int firstNum = 0;
        int secondNum = 0;

        //input data
        int result = calc.multiply(firstNum, secondNum);
        //then
        assertEquals(0, result);
    }
    @Test
    public void Subtract_zero_and_positive_Equals_zero() {
        // given
        int firstNum = 50;
        int secondNum = 0;

        //input data
        int result = calc.multiply(firstNum, secondNum);
        //then
        assertEquals(0, result);
    }
    @Test
    public void substract_two_big_numbers_for_boundry_output_is_negative() {
        // given
        int firstNum = 400000000;
        int secondNum = 50;

        //input data
        int result = calc.multiply(firstNum, secondNum);
        //then
        assertEquals("Bloga ivestis",-1474836480, result);
    }
}

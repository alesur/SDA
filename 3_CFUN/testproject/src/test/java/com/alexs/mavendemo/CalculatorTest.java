package com.alexs.mavendemo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_twoPositiveIntegers_correctPositiveSum() {
        // given
        int firstNum = 10;
        int secondNum = 2;

        // when
        int result = calc.divide(firstNum, secondNum);

        // then
        // assert result == 3;
        assertEquals(5, result);
    }

    @Test
    public void TestArray(){
        int[] a1 = {2, 5};
        int[] a2 = {4, 6};

        assertEquals(a1, a2);

    }
}

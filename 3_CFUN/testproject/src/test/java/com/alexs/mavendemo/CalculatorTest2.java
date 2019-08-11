package com.alexs.mavendemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest2 {

    Calculator calc;

    @Before
    public void setUp(){
        System.out.println("setUp()");
        calc = new Calculator();
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        calc = null;
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_twoPositiveIntegers_correctPositiveSum() {
        // given
        int firstNum = 1;
        int secondNum = 2;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        assertEquals("Variables are equal? ", 3, result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_givenTwoNegativeIntegers_correctNegativeSum(){
        // given, when
        int result = calc.add(-1, -2);

        // then
        // assert result == -3;
        assertEquals(-3, result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_givenOneNegativeOnePossitive_correctSum(){
        // given
        int firstNum = -1;
        int secondNum = 2;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        // assert result == 1;
        assertEquals(1, result);
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMaxAndZero_outputsIntegerMax(){
        // given
        int firstNum = Integer.MAX_VALUE;
        int secondNum = 0;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        assert result == firstNum;
    }

    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMinAndZero_outputsIntegerMin(){
        // given
        int firstNum = Integer.MIN_VALUE;
        int secondNum = 0;

        // when
        int result = calc.add(firstNum, secondNum);

        // then
        assert result == firstNum;
    }
}

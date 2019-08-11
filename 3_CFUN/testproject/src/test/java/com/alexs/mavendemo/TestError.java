package com.alexs.mavendemo;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class TestError {
    Calculator calc = new Calculator();

    /**
     *  NEGATIVE PATH
     */

    // then
    @Test(expected = ArithmeticException.class)
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMaxPlusIntegerMax_raisesException() {
        // given
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;

        // when
        int result = calc.addAdvanced(firstNum, secondNum);
    }

    // Testing for exceptions using a different methodology
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    // @Ignore
    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_integerMaxPlus1_raisesException() {
        // then
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("Can't add possitive numbers to int.MAX_VALUE");

        // given
        int firstNum = Integer.MAX_VALUE;
        int secondNum = 1;

        // when
        int result = calc.addAdvanced(firstNum, secondNum);

        // TASK : : change the order of then and when - observe what happens!
    }
@Ignore
    @Test
    // [the name of the tested method]_[expected input / tested state]_[expected behavior]
    public void add_wrong_input() {
        // then
        int firstNum = 9;
        int secondNum = 11;
        expectedException.expect(ArithmeticException.class);
        int result = calc.addAdvanced(firstNum, secondNum);
        //expectedException.expectMessage("Wrong input");

        // given
       // int firstNum = 10;
      //  int secondNum = 11;

        // when
      //  int result = calc.addAdvanced(firstNum, secondNum);
       // expectedException.expect(ArithmeticException.class);
        // TASK : : change the order of then and when - observe what happens!
    }
}

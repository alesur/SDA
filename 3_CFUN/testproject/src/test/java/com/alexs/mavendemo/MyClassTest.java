package com.alexs.mavendemo;

import org.junit.Test;

public class MyClassTest {
    // public static void main(String[] args) {
    //
    //     String input = "Hello World";
    //     String result = MyClass.myMethod(input);
    //
    //     if (input.equals(result))
    //         System.out.println("SUCCESS");
    //     else
    //         System.out.println("FAILURE");
    // }

    // Rewritting the test to use JUNIT
    @Test
    public void simpleTest(){
        // given
        String input = "Hello World";

        // when
        String result = MyClass.myMethod(input);

        // then
        assert result == input;

        // teardown ( not needed in this one, but needed in general)
        input = null;

    }
    @Test
    public void simpleFailingTest(){
        // given
        String input = "Hello World";

        // when
        String result = MyClass.myMethod(input);

        // then
        assert result + "A" == input;

        // teardown (not needed in this case, but needed in general)
        input = null;
    }
}

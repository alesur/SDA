package com.alexs.mavendemo;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
       return a * b;
    }

    public int addAdvanced(int a, int b) {
        // if the first or second one is MAX, we should not allow addition
        if(a == Integer.MAX_VALUE && b == Integer.MAX_VALUE){
            throw new ArithmeticException("Can't add MAX_VALUE");
        }

        if(a == Integer.MAX_VALUE && b > 0){
            throw new ArithmeticException("Can't add possitive numbers to int.MAX_VALUE");
        }

        if(a<=10 && b>=10){
            throw new ArithmeticException("Wrong input");
        }

        return a + b;
    }
}
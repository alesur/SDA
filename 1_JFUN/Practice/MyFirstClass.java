package com.apps.yo.forjava;

public class MyFirstClass {

    int x = 10;
    String str = "Labas!";


    public void inEnglish(){
        System.out.println("inEnglish().... Hello!");
    }

    public void inLithuanian(){
        System.out.println("inLithuanian().... " + str);
    }


    public static void main(String[] args) {
        MyFirstClass obj = new MyFirstClass();

        System.out.println("value of x: " + obj.x);
        System.out.println("value of str: " + obj.str);

        obj.x++;
        System.out.println("new value of x: " + obj.x);

        obj.inEnglish();
        obj.inLithuanian();




    }



}

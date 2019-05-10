package com.apps.yo.forjava;

public class ConstantVariables {
//===========================================
    /*FINAL
    variables - are constants, can never be changed
    methods - you can never override a final method()
    class - stops Inheritance*/
//===========================================


    //Recommended way... declare and initialize together
    static final String SECRET= "k^h$b{f@n%$#jlk098^%$#";
    static final double PI = 3.141592653589793;


    public static void main(String[] args) {
        ConstantVariables obj = new ConstantVariables();

        System.out.println(obj.PI);
        System.out.println(obj.SECRET);

        System.out.println("====================");

        System.out.println(ConstantVariables.PI);
        System.out.println(ConstantVariables.SECRET);



    }


}

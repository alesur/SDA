package com.apps.yo.forjava;

public class Methods {

    int count=0;
    String name = "Yohan";


    public void increaseCount(){
        count++;
    }

    public void increaseCountBy(int x){
        count = count + x;
    }

    public int add_numbers(int a, int b, int c){

        int sum = 0;
        sum = a + b + c;

        return sum;
    }

    public String add_lastName(String str){

        name = name + " " + str;

        return name;
    }


    public boolean isNameCorrect(String vardas){
        boolean correct=false;

        if(name.equals(vardas)){
            correct = true;
        }

        return correct;
    }


    public static void main(String[] args) {
        Methods m = new Methods();

        m.increaseCount();
        System.out.println("1... " + m.count);
        m.increaseCount();
        m.increaseCount();
        System.out.println("2... " + m.count);


        m.increaseCountBy(6);
        System.out.println("2... " + m.count);


        int answer = m.add_numbers(5,10,20);
        System.out.println("3... " + answer);


        String ans = m.add_lastName("Wadia");
        System.out.println("4... " + ans);


        boolean reply = m.isNameCorrect("Yohan");
        System.out.println("5... " + reply);
    }


}

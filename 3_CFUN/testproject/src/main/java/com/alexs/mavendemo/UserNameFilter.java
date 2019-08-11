package com.alexs.mavendemo;

public class UserNameFilter {


    public static String[] filername(String[] names) {

        String[] arr = new String[5];
        Integer j = 0;
        for (int i = 0; i < names.length; i++) {

            if (names[i].length() > 5) {
                arr[j] = names[i];
                j++;
            }
        }
        return arr;

    }

    public static String checkaname(String names) {
int a = names.length();
        if (a>5){
            throw new ArithmeticException("Too long name");
        }
  return names;
    }
}

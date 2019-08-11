package JBLessons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String secretCode = "welcome to hyperskill";
        char[] array = secretCode.toCharArray();
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }
}

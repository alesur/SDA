import java.util.Arrays;

public class MaxMinAvg {

    public static void main(String[] args) {
        int n = 10;
        int avg = 0;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 51 + 1));
            avg += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("AVG : " + avg / array.length);
        System.out.println("MIN : " + Arrays.stream(array).min().getAsInt());
        System.out.println("MAX : " + Arrays.stream(array).max().getAsInt());

    }
}
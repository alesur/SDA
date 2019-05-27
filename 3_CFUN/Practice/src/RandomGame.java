import java.util.Random;

public class RandomGame {

    public static void main(String[] args) {
        int x = 0, y = 0, z = 0;
        int count = 0;

        while (z != 6) {

            Random rnd = new Random();
            int num = rnd.nextInt(9);
            count++;

            if (num == 6) {
                if (x == 0) {
                    x = num;
                    System.out.println("Found x: " + x);
                    System.out.println(count);

                } else if (y == 0) {
                    y = num;
                    System.out.println("Found y: " + y);
                    System.out.println(count);

                } else if (z == 0) {
                    z = num;
                    System.out.println("Found z: " + z);
                    System.out.println(count);

                }


            }

        }
    }
}

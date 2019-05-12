import java.sql.SQLOutput;

public class Eglute {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int x = b;
        for (int i = 1; i <= a; i++) {
            for (b = x - 1; b >= 1; b--) {
                System.out.print(" ");
            }
            x--;
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

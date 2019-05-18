import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 33");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n = scan.nextInt();
        System.out.println("Sum of input digits: " + SumDigits(n));

    }//psvm

    public static int SumDigits (int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}//class

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 12");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        double num1 = scan.nextInt();
        System.out.print("Enter num 2: ");
        double num2 = scan.nextInt();
        System.out.print("Enter num 3: ");
        double num3 = scan.nextInt();
        double avg = (num1 + num2 + num3)/3;

        System.out.println("Average is: " + avg);





    }//psvm

}//class

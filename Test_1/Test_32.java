import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 32");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " > " + num2);
        }
        else if (num1<num2){
            System.out.println(num1 + " < " + num2);
        }
        else if (num1==num2){
            System.out.println(num1 + " = " + num2);
        }

    }//psvm

}//class

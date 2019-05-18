import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 6");
        System.out.print("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int firstnumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondnumber = scan.nextInt();
        System.out.println("x+y: " + (firstnumber+secondnumber));
        System.out.println("x-y: " + (firstnumber-secondnumber));
        System.out.println("x*y: " + firstnumber*secondnumber);
        System.out.println("x/y: " + firstnumber/secondnumber);
        System.out.println("x mod y: " + firstnumber%secondnumber);

    }//psvm

}//class
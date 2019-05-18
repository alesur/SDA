import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 7");
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
     for(int i=1; i<=10; i++){
         System.out.println("8 x " + i + " = " + num*i);
     }
    }//psvm

}//class

import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 34");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter lenght of hexagon side: ");
        double n = scan.nextInt();
        System.out.println("The area of the hexagon is: " + RunFormula(n));

    }//psvm

    public static double RunFormula (double n){
        double calculate = 0;
      calculate = (6 * Math.pow(n, 2))/(4*Math.tan(Math.PI/6));

        return calculate;
    }
}//class

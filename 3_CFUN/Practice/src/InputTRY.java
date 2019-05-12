import java.sql.SQLOutput;
import java.util.Scanner;

public class InputTRY {
    public static void main(String[] args) {

        System.out.print("Enter Starting point: ");
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();

        System.out.print("Enter Ending point: ");
        int end = scan.nextInt();

        System.out.println("Start from: " + start + " End on: " + end);
        System.out.print("Sequence: ");
        for(int i=start; i<=end; i++)

            System.out.print(i + ", ");
    }
}

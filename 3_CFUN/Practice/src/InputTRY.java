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
//        int i = 0;
//        for (i = start; i <= end; i++) {
//
//            if (i == end) {
//                System.out.print(i + " ...thats it!");
//            } else {
//                System.out.print(i + ", ");
//            }
//
//        }
        int count=0;

        for(int i = start; i<= end; i++){
            for(int x = 2; x<i; x++){

                if (i % x == 0){
                    break;
                }

                if(x+1 == i){
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("There are " + (count) + " Primes!"); //add 1 for "2"... even prime

        scan.close();

    }//psvm
}//class

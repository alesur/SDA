import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Test Number: 13");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Width: ");
        double width = 5.6;
        System.out.print("Enter Height: ");
        double height = 8.5;
        double area = width*height;
        double perimeter = 2*(width+height);

        System.out.println("Area :" + area);
        System.out.println("Perimeter : " + perimeter);
        System.out.println("===================");
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter); // printing with formating







    }//psvm

}//class

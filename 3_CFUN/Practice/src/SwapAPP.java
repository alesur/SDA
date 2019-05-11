public class SwapAPP {

    public static void main(String[] args) {

        int[] digiline = new int[4];
        int sum = 0;
        digiline[0] = 10;
        digiline[1] = 5;
        digiline[2] = 30;
        System.out.println(digiline[0] + " " + digiline[1] + " " + digiline[2]);
        digiline[3] = digiline[0];
        digiline[0] = digiline[1];
        digiline[1] = digiline[3];
        digiline[3] = 0;

        System.out.println("Swapped: " + digiline[0] + " " + digiline[1] + " " + digiline[2]);

        for (int i = 0; i < digiline.length; i++) {

            sum += digiline[i];

        }
        System.out.println(sum);

    }//psvm

}//class

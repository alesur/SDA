public class SwapAPP {

    public static void main(String[] args) {

       int[] digiline = new int[4];
        digiline[0] = 10;
        digiline[1] = 5;
        digiline[2] = 30;
        System.out.println(digiline[0] + " " + digiline[1]+ " " + digiline[2]);
        digiline[3]=digiline[0];
        digiline[0]=digiline[1];
        digiline[1]=digiline[3];

        System.out.println(digiline[0] + " " + digiline[1]+ " " + digiline[2]);
    }//psvm

}//class

public class AlfoFindEVEN {

    public static void main(String args[]) {
        int[] arr = {50, 44, 0, 3, 7, 2, -13, 55,};
        System.out.print("EVEN: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");

            }


        }
        System.out.println();
        System.out.print("FIRST: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                break;
            }

        }
    }
}

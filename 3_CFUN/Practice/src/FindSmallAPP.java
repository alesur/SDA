public class FindSmallAPP {
        public static void main(String args[]) {
            int[] arr = {50,0,-18,2,2};
          //  int[] arr = {-1, -2, 3};
            System.out.println("Min: " + minvalOfArray(arr));
        }

        public static int minvalOfArray(int[] arr){
            int val = arr[0];
            for(int i = 1; i < arr.length; i++){
               // System.out.println(val);
                if (val>arr[i]){
                    val=arr[i];
                }
            }
            return val;
        }
}

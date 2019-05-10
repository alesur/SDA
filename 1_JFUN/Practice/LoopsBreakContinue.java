public class LoopsBreakContinue {

    public static void main(String[] args) {

        for(int i=0;i<=10;i++){

            if(i==6){ break;  }

            System.out.println("i: " + i);
        }

        System.out.println("==================");


        for(int i=0;i<=10;i++){

            if( i%3 == 0 ){ continue;  }

            System.out.println("i: " + i);
        }





    }



}

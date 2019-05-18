
public class Recursive {


        public void abc (int a, int b){
            if(a==b){
                System.out.println("*********Value of a: " + a);
            }
            else{
                a++;
                System.out.println("Value of a: " + a);

                abc(a,b);
                System.out.println("===" + a);
            }
            a=1;
            System.out.println("Valuea of az: " + a);
        }
    public static void main(String[] args) {

            Recursive obj = new Recursive();
            obj.abc(1, 7);
    }

}//class

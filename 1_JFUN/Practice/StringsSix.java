public class StringsSix {

    public static void main(String[] args) {


        String str = "today we make our programming logic stronger!";

        System.out.println(str.replace('o', 'X'));
        System.out.println(str);

        System.out.println("==============");

        String s = "hello How are you?";
        System.out.println(s.substring(6));
        System.out.println(s.substring(6, 12)); // substring(includes, excludes)

        System.out.println("==============");

        String Order_Num = "23-A33/yohan";
        int position = Order_Num.indexOf('/');
        String name = Order_Num.substring(position);//... solve?

        System.out.println("Name: " + name);
        //power guns:      Tx-Ray-750, Tx-Ray-300
        //client history   yw/45/87/34/91



    }
}

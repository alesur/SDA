package Lambda;

public class Lambda2 {
    public static void main(String[] args) {

       // Screen scr = new Plancheta();
       // scr.Display();

   /*     Screen scr = new Screen() {
            @Override
            public void Display() {
                System.out.println("Display Home Screen");
            }
        };
        scr.Display();
    */

       //Screen scr = () -> {System.out.println("Display Home Screen1");};
      // Screen scr = () -> System.out.println("Display Home Screen2");
      // scr.Display();

       Screen scr = (str) -> System.out.println("Display Home Screen" + str);
       String str = " in 720 x 1080";
       scr.Display(str);

    }
}

interface Screen{
    void Display(String str);
}

/*class Plancheta implements Screen{

    @Override
    public void Display() {
        System.out.println("Displaying Home Screen");
    }
}*/


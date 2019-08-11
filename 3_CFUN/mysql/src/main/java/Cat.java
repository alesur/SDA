import AES.AES;


import java.net.PasswordAuthentication;
import java.util.Arrays;

public class Cat {
    public static void main(String[] args) {

       String secretKey = "boooooooooom!!!!";
        int a = (int) 3.15;
        System.out.println(a);

        // Move cat = new Move();

        Move.Forward cat1 = new Move.Forward();

        cat1.jump(12);

       // System.out.println(LoginPassword.Encode("Aleksandr Surkov"));

        for (SomeTest.Season s : SomeTest.Season.values()) {
            System.out.println(s);
        }

        System.out.println(SomeTest.Season.FALL.name());


        String originalString = "howtodoinjava.com";

        String encryptedString = AES.encrypt(originalString, secretKey) ;
        String decryptedString = AES.decrypt(encryptedString, secretKey) ;

        System.out.println(AES.encrypt("1",secretKey));
       // System.out.println(encryptedString);
       // System.out.println(decryptedString);

        SomeTest.Season[] seasons = SomeTest.Season.values();
        System.out.println(Arrays.toString(seasons));
    }


}

class SomeTest {
    public enum Season {
        FALL,
        SPRINT,
        SUMMER,
        WINTER
    }
}

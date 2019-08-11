package lt.sdacademy.hashmap;


import java.util.Arrays;
import java.util.List;

public class Translate {
   /* List<Translate> translators = Arrays.asList(
            new Translate("Hi", "Goodbye"));*/
       private String greeting;
       private String goodbye;
       private String language;

       public Translate(String greeting, String goodbye) {
           this.greeting = greeting;
           this.goodbye = goodbye;
       }


       public String greet(String name) {

           return greeting + ", " + name + "!";

       }

       public String goodbye(String name) {
           return goodbye + " " + name + " :)";
       }
   }

package lt.sdacademy.hashmap;

import org.junit.Assert;
import org.junit.Test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HashMapTest {
    @Test
    public void testHashmap() {
        User luke = new User("Luke");
        User simona = new User("Simona");

        List<User> group = Arrays.asList(luke, simona);

        Conversations conversations = new Conversations();

        conversations.addMessageToGroup(group, new Message(luke, "Hey, what's up"));
        conversations.addMessageToGroup(group, new Message(simona, "Good, how are you?"));

        List<User> sameGroupButDuplicated = Arrays.asList(new User("Luke"), new User("Simona"));
        List<Message> thread = conversations.listMessages(sameGroupButDuplicated);

        Assert.assertEquals(2, thread.size());
        Assert.assertEquals("Good, how are you?", thread.get(1).getText());
        // TODO Assertions about message content
    }

    @Test
    public void testLike() {
        User luke = new User("Luke");
        User simona = new User("Simona");

        Message message = new Message(luke, "Just left work");
        message.new Like(simona);
        // -> 'Simona liked "Just left work"'
    }

    @Test
    public void testEitherOr() {
        EitherOr<String, Integer> eo1 = EitherOr.either("Luke");

        Assert.assertTrue(eo1.isEither());
        Assert.assertFalse(eo1.isOr());
        Assert.assertEquals("Luke", eo1.getEither());
    }

    @Test
    public void testPredicate() {
        List<String> myList = Arrays.asList("Luke", "Simona", null);


        List<String> result = myList.stream().filter(o -> o != null).collect(Collectors.toList());

        Assert.assertEquals(Arrays.asList("Luke", "Simona"), result);
    }

    @Test
    public void testSimple() {
List<String> names = Arrays.asList("Alex", "Petra", "John", "Marco");
List<String> lang = Arrays.asList("esp", "en", "fr", "lt");

      /*  System.out.println(greet("Alex", "lt"));
        System.out.println(greet("Petra", "fr"));
        System.out.println(greet("John", "en"));*/

        System.out.println("=======================");
        for (String name: names){
            for(String langs: lang) {
                System.out.println(greet(name, langs));
            }
        }

    }

    public String greet(String name, String lang) {
        String arr[] = {"Labas", "Bonjour", "Hi", "¡HOLA!"};
        int i=0;
        if (lang == "lt")  {i = 0;}
        if (lang == "fr")  {i = 1;}
        if (lang == "en")  {i = 2;}
        if (lang == "esp") {i = 3;}

        String line = arr[i] + ", " + name + "!";

        return line;
    }



    @Test
    public void testGreeter() {
        List<Translate> translators = Arrays.asList(
              /*  new Translate("Labas", "Iki"),
                new Translate("Bonjour", "Aurevoir"),
                new Translate("Priviet", "Paka"),*/
                new Translate("Labas", "Iki")
        );
        List<String> names = Arrays.asList("Pijus", "Marco", "Indre", "Donata", "Guoda");

        for (Translate translate : translators) {
            for (String name : names) {
              //  String hello = translator.greet(name);

              //  System.out.println(hello);

                String goodbye = translate.goodbye(name);

                System.out.println(goodbye);
            }
        }
    }


}

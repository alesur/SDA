package Test;

public class StringTryApp {
    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Some lorem ipsum. Bla bla bla. ");
        text.append("Some else random text. ");
        System.out.println(text);

        String s = text.toString();
        System.out.println(s);
    }
}

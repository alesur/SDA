import lang.*;

public class index {
    public static void main(String[] args) {

Milka obj = new Milka();

obj.setColor("blue");
        System.out.println(obj.getColor());

        Password psw = new Password();
        psw.setPassword("Verry log psw");
        System.out.println(psw.getPassword());

        System.out.println(LT.getHi("Jonas"));

        System.out.println(Calculate.pswLength("Rararabababhhhjhhhjhha"));
    }
}

class Vector {
    private int x;
    private int y;
    private int z;
    String word;

    public Vector(int x, int y, int z, String word) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.word = word;
    }

    public int Length() {
        return (int) Math.sqrt(x * x + y * y + z * z);
    }
}

class User {
    private String name, username;
    private int age;

    public User(String name, String username, int age) {
        this.name = name;
        this.username = username;
        this.age = age;
    }

    public void access() {
        if (age > 18) {
            System.out.println("Access granted for " + name);
        } else {
            System.out.println("Access Denied for " + name);
        }
    }

    public int randomize() {

        return (int) (Math.random() * age + 1);
    }
}

class HasACat {
    private String name;
    private int age, legs, tail;
    private String color;
    private boolean fur;

    public HasACat(String name, int age, int kojos, int tail, String color, boolean fur) {
        this.name = name;
        this.age = age;
        this.legs = kojos;
        this.tail = tail;
        this.color = color;
        this.fur = fur;

    }
}

public class VectorCalc {
    public static void main(String[] args) {
        Vector a = new Vector(10, 20, 30, "Math");
        System.out.println(a.Length());

        User a1 = new User("John", "jb34", 23);

        a1.access();
        System.out.println(a1.randomize());

        HasACat cat1 = new HasACat("Milka", 4, 4, 1, "Gray", true);

        System.out.println(cat1);


    }
}

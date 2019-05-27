public class Abstractx {
    public static void main(String[] args) {

        //Automobile X = new Automobile(75,6);
        Truck t = new Truck(75,6);
        t.move();
        Van v = new Van(175,3);
        v.move();


        Automobile a = new Truck(100,4);
        a.move();


    }
}

abstract class Automobile { //never can be used as new Object
    private int maxSpeed;       //private integers
    private int gears;

    public Automobile(int maxSpeed, int gears) {  //constructor
        this.maxSpeed = maxSpeed;
        this.gears = gears;
    }

    public int getMaxSpeed() { return maxSpeed; }
    public int getGears() { return gears; }

    public abstract void move();
}

class Truck extends Automobile {
    public Truck(int maxSpeed, int gears) {
        super(maxSpeed,gears);
    }

    @Override
    public void move() {
        System.out.println("TRUCK uses Diesel to move");
    }
}

class Van extends Automobile {
    public Van(int maxSpeed, int gears) {
        super(maxSpeed,gears);
    }

    @Override
    public void move() {

        System.out.println("VAN uses Petrol to move");
    }
}
//try hierarchy of override methods

abstract class GOD{
    abstract void fly();
    abstract void jump();
}

abstract class Man extends GOD{
    //public void fly(){}
    //public void jump(){}
    abstract void talk();
}

class Boy extends Man{
    public void fly(){}
    public void jump(){}
    public void talk(){}

}

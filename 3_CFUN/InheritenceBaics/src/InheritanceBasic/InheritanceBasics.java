import java.sql.SQLOutput;

public class InheritanceBasics {
    public static void main(String[] args) {

//        Father f = new Father();
//        System.out.println("Car: " + f.car);
//        System.out.println("has House: " + f.house);
//
//        System.out.println("==============================");
//
//        Son s = new Son();
//        System.out.println("Car: " + s.car);
//        System.out.println("has House: " + s.house);
//        System.out.println("Bike: " + s.Bike);
//
//        System.out.println("==============================");
//
//        Wife w = new Wife();
//        System.out.println("Car: " + w.car);
//        System.out.println("has House: " + w.house);
//        System.out.println("Bike: " + w.Bike);

//        Dauther d = new Dauther();
//        System.out.println("Dukra " + d.kasytes );
//    //    d.kasytes = 15;
//        System.out.println(d.kasytes);
//        System.out.println(d.money);
//        System.out.println(d.Bike + " " + d.car);
//        d.MyMethod();

        Dauther d2 = new Dauther();
        System.out.println("Dukra 2 " + d2.kasytes);



    }//psvm
}//inheritance class

abstract class Father {
    abstract void Father();
    String car = "Chevy";
    boolean house = true;

    Father() {
        System.out.println("Father Constructed");
    }
}

class Son extends Father {
    String Bike = "Yamaha";
    int money = 5;
public void Father(){}
    Son() {
        System.out.println("Sun Constructed");
    }
}

//son's Wife
class Wife extends Son{
    Wife() {
        System.out.println("Wife Constructed");
    }
}

class Dauther extends Son{
   final int kasytes = 10;

   static void MyMethod(){
       System.out.println("yupi yay!");
   }

    Dauther() {
        System.out.println("Dukra Susikure");
    }
}
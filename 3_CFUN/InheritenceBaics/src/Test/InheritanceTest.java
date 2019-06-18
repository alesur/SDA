package Test;


class Player{
    public int lvl=1;
    public int getlvl(){return lvl;}

//    public moveit(){
//        System.out.println("I can move");
//    }
//    public jump(){
//        System.out.println("I can jump");
//    }
}

class Superman extends Player{
    public int lasers = 10;
    public int laserpower(){
        System.out.print("Im Superman! ");
        System.out.print("I have a Laser power. ");
        return lasers;
    }
//    shootlaser(){
//        System.out.println("I can shoot laser");
//    }
}
class Spiderman extends Player {
    public int web = 8;

    public int webshoot() {
        System.out.print("Im Spiderman! ");
        System.out.print("I have a spider web. ");
        return web;
    }
}
public class InheritanceTest {
    public static void main(String[] args) {

        Superman a = new Superman();
       System.out.println("And by default can shoot: " + a.laserpower() + " times!");
        System.out.println("I'm lvl " + a.lvl);

        Spiderman z = new Spiderman();
        z.lvl = 2;
        z.web = 15;
        System.out.println("And by default can shoot: " + z.webshoot() + " times!");
        System.out.println("I'm lvl " + z.lvl);


    }//psvm
}//class
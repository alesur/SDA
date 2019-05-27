public class Composition {
    public static void main(String[] args) {

        Owner me = new Owner("Windows", 8, 100);
        me.getMyStatus();
    }
}

class OS{
    String name;
    public OS(String name){
        this.name=name;
    }
    
    public String getStatus(){
        if(name.equals("Android")){return "Cool OS";}
        else if(name.equals("iOS")){return "hmmm... gerai!";}
        else{return "Blogai!";}// missing return statement
    }
}

class Version {
    int version;

    public Version(int version) {
        this.version = version;
    }

    public String getStatus() {
        if (version > 10) {
            return "Great!";
        } else if (version < 10) {
            return "Please Update,,,";
        } else {
            return "Special Case!";
        }
    }
}

class BatteryType {
    int bt = 1;

}

class Battery {
    int power;
    public Battery(int power){this.power = power; }

    public String getStatus() {
        if (power > 1000) {
            return "Good power";
        } else {
            return "Low power";
        }
    }
}
    class Owner{
        Version v;
        OS os;
        Battery bat;

        public Owner(String os, int version, int power){
            this.os= new OS(os);
            this.v = new Version(version);
            this.bat = new Battery(power);
        }

        public void getMyStatus(){
            System.out.println(os.getStatus());
            System.out.println(v.getStatus());
            System.out.println(bat.getStatus());
        }
    }

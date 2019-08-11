package facadeLaunch.RocketMissile;

public class SetCoordinates {

    private EnterLatLon fuelPump = new EnterLatLon();

    public void set(){
        System.out.println("Getting coordinates...");
    }

    public void provided() {
        fuelPump.pump();
        System.out.println("STAGE[1 of 3] Coordinates provided | Latitude and Longitude are set!");
    }

}

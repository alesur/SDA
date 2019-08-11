package facadeLaunch.RocketMissile;

public class RquestFromGeneral {

    private GeneralRequest airFlowMeter = new GeneralRequest();

    public void askGeneral() {
        airFlowMeter.getMeasurements();
        System.out.println("Confirmation from General granted");
    }

}

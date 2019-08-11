package facadeLaunch;


import facadeLaunch.RocketMissile.*;

public class RocketMissileConfirmation {
    private static final int SECRET_KEY = 9748;
    private SetCoordinates setCoordinates = new SetCoordinates();
    private RquestFromGeneral rquestFromGeneral = new RquestFromGeneral();
    private CallPresident callPresident = new CallPresident();
    private PresidendConfirmationAndCode confirmationAndCode = new PresidendConfirmationAndCode();

    public void startLaunch(){
        setCoordinates.set();
        rquestFromGeneral.askGeneral();
        setCoordinates.set();
        setCoordinates.provided();
        callPresident.dialNumberOnRedPhone();
        confirmationAndCode.getSecretCode(SECRET_KEY);
    }

}

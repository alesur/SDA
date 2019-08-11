package facadeLaunch.RocketMissile;

public class PresidendConfirmationAndCode {
    private static final Integer PRESIDENT_CONFIRMATION_CODE = 9748;

    private int code;
    public void getSecretCode(int code) {

        this.code = code;
        if (code ==(PRESIDENT_CONFIRMATION_CODE) ){
            System.out.println("Code is Correct");
            launch();
            TurnTheKey turnTheKey = new TurnTheKey();
            turnTheKey.turn();
        }else {
            stop();
        }
    }

    public void launch() {
        System.out.println("STAGE[2 of 3] Start the Launch!");
    }
    public void stop() {
        System.out.println("Abort Code is Incorect!");
    }

}

public class Password {
    private String psw;

    int getPassword(){
        return psw.hashCode();
    }

    void setPassword(String psw){
        this.psw = psw;

    }
}

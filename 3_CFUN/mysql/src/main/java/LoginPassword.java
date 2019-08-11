public class LoginPassword {
   static String Encode(String password){
     password = String.valueOf(password.hashCode());
        return password;
    }
}

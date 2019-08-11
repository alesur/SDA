import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:sqlite:bank.db");
        ExpenseStorage storage = new ExpenseStorage(connection);
        //

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Password: ");
        String userPsw = input2.nextLine();

        userPsw = Integer.toString(userPsw.hashCode());


        if (userName.equals(storage.loginToBank(userName).getLogin()) &&
                userPsw.equals(storage.loginToBank(userName).getPassword())) {
            System.out.println("\n\n\n\n====================================");
            System.out.println("Hello, " + storage.loginToBank(userName).getPayer() + ".");
            System.out.println("Your current balance is: " + storage.loginToBank(userName).getAmount() + "€");
            System.out.println("\n\n====================================");
            //MENU
            Scanner option = new Scanner(System.in);
            System.out.println("MENU:");
            System.out.println("1) Change password");
            System.out.println("2) Change else");
            String optionselect = input.nextLine();
            System.out.println(optionselect);

            if (optionselect.equals("1")) {
                System.out.println("Changing password");
                Expense user = new Expense();

                Scanner newpasword = new Scanner(System.in);
                System.out.print("Enter new password: ");
                String setpass = input.nextLine();
                setpass = Integer.toString(userPsw.hashCode());
                user.setPassword(setpass);
                storage.insert(user);
                System.out.println("\n\n\n\n====================================");
                System.out.print("Password changed!, you can now Login with new password");

            } else {
                System.out.println("Not ready...");
            }


        } else {
            System.out.println("Wrong username or password");
        }


    }


}

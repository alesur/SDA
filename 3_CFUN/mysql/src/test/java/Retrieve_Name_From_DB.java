import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Retrieve_Name_From_DB {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:sqlite:bank.db");
        ExpenseStorage storage = new ExpenseStorage(connection);
        Expense user = new Expense();

        storage.insert(user);

    }

}

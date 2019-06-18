package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class LibisToCSVBuilder {
    public static void main(String[] args) throws IOException {

/**
 * Upload data and parse
 */
        FileReader fr = new FileReader("C:\\Users\\Aleksadras\\Desktop\\Registruoti.txt");
        StringBuilder text = new StringBuilder();
        int i;
        while ((i = fr.read()) != -1) {
            text.append((char)i);

        }
        String splited = text.toString();
       // String[] regex = text.toString();  //.split("[0-9]");
    //   System.out.println(regex);
        fr.close();

/**
 * Create CSV and store data
 */

  /*      FileWriter fw;
        fw = new FileWriter("NewUsers.csv", true);//write more
        String id = "16516";

        fw.write("FirstName;LastName;UserTypeID;ActivationDate;CardCode;CardFormatName;AccessLevel;Location");
        fw.write("\n");
        fw.write(id + ";" + id + ";User;2019-05-31 00:00;" + Integer.parseInt(id, 16) + ";48bit;Everywhere;Main");
        fw.close();
        System.out.println("Writing is done....");
  */
    }
}

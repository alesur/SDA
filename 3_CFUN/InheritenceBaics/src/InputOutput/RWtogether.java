package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class RWtogether {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("myFile.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Aleksadras\\Downloads\\RWtogether.txt");

        int i=0;
        while((i=fis.read()) != -1){
            //System.out.print((char)i);
            fos.write(i);
        }

        System.out.println("Reading & Writing is done!");

    }
}

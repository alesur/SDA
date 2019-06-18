package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {

/*
        FileWriter fw;
        fw=new FileWriter("C:\\Users\\Aleksadras\\Downloads\\FileRW.txt",true);//write more
        fw.write("Hey! Whats Up... This is written with FileWriter!");
        fw.close();
        System.out.println("Writing is done....");
*/


        FileReader fr = new FileReader("C:\\Users\\Aleksadras\\Downloads\\FileRW.txt");
        StringBuilder text = new StringBuilder();
        int i;
        while((i=fr.read()) != -1){
            text.append((char)i);
          //System.out.print((char)i);//use println to see each char
            }
        text.reverse();
        System.out.println(text);
        fr.close();






}
}

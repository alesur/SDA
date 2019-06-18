package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class Controller {
    @FXML
    Button btn, ok, delt;
    @FXML
    TextField txtf, txtf2;
    @FXML
    TextArea txta;
    @FXML


    int i = 1, o = 1;
    StringBuilder name = new StringBuilder();

    public void btn_Click(ActionEvent e) {

        System.out.println("The Tempo is PUSHED " + i + " times");
        i++;
    }

    public void ok_Click(ActionEvent e) {


        System.out.println("The OK is clicked " + o + " times");
        o++;


        //  System.out.println("Labas " + name);
        name.append(new StringBuilder(txtf.getText() + "\n"));
        txta.setText(String.valueOf(name));
        // System.out.println(name);
    }

    public void AnyKeyInput(KeyEvent e) {
        name.append(new StringBuilder(txtf2.getText() + "\n"));
        txta.setText(String.valueOf(name));
        //  String input = txtf2.getText();
        // System.out.println(input);

    }
    public void DeleteText(ActionEvent e) {
        name.delete(0, name.length()-1);
        txta.setText(String.valueOf(name));
        //  String input = txtf2.getText();
        // System.out.println(input);

    }



}

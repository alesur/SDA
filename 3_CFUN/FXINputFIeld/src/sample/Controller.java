package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField txtf1;
    @FXML
    TextArea txtf2;


    public void ok_Click(ActionEvent e) {
        System.out.println("");
     // this.name.append(new StringBuilder(this.txtf.getText() + "\n"));
    //  this.txt1.setText(String.valueOf(this.name));
    }

}

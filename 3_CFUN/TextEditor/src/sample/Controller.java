package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.*;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    StringBuilder loadtext = new StringBuilder();
    @FXML
    private TextArea texta;
    @FXML
    private MenuItem cnvrt;

    /**
     * Open File
     */
    public void OpenFile(ActionEvent e) throws IOException {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Documents", "*.txt;*.csv"));
        File selectedFile = fc.showOpenDialog(null);

        if (selectedFile != null) {

            loadtext.delete(0, loadtext.length()); //Clear on file load
            FileReader fr = new FileReader(selectedFile.getAbsolutePath());

            int i = 0;
            while ((i = fr.read()) != -1) {
                loadtext.append((char) i);
            }
            texta.setText(String.valueOf(loadtext));
            fr.close();
            cnvrt.setDisable(false);
        } else {

        }
    }//OpenFile

    /**
     * Save To File
     */

    public void FileSaver(ActionEvent e) throws IOException {
        FileChooser fileChooser = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CSV file (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            SaveToFile(texta.getText(), file);
        } else {

        }
    }

    public void SaveToFile(String content, File file) throws IOException {
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//SaveFile

    /**
     * Converter
     */
    public void ConvertAll(ActionEvent e) {
        String[] arr = loadtext.toString().split("\\D+");
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dtf = dt.format(format);
        String hexstring = "";

        loadtext.delete(0, loadtext.length());//clear for reuse
        loadtext.append("FirstName;LastName;UserTypeID;ActivationDate;CardCode;CardFormatName;AccessLevel;Location\n");

        for (String string : arr) {
            int idnum = Integer.parseInt(string);
            if (idnum >= 151601 && idnum <= 152100 ||
                    idnum >= 165501 && idnum <= 166000 ||
                    idnum >= 177501 && idnum <= 178000 ||
                    idnum >= 182501 && idnum <= 183000 ||
                    idnum >= 195501 && idnum <= 196500 ||
                    idnum >= 242501 && idnum <= 247500 ||
                    idnum >= 302000 && idnum <= 302999 ||
                    idnum >= 310000 && idnum <= 313000 ||
                    idnum >= 318001 && idnum <= 326000 ||
                    idnum >= 465501 && idnum <= 466000 ||
                    idnum >= 472501 && idnum <= 473000 ||
                    idnum >= 479501 && idnum <= 480500 ||
                    idnum >= 491001 && idnum <= 491500 ||
                    idnum >= 551001 && idnum <= 552000 ||
                    idnum >= 578501 && idnum <= 579500 ||
                    idnum >= 599501 && idnum <= 600000 ||
                    idnum >= 610001 && idnum <= 617000 ||
                    idnum >= 726001 && idnum <= 727000 ||
                    idnum >= 736501 && idnum <= 737000 ||
                    idnum >= 739501 && idnum <= 740000 ||
                    idnum >= 782501 && idnum <= 783000 ||
                    idnum >= 799001 && idnum <= 800000 ||
                    idnum >= 817501 && idnum <= 820500 ||
                    idnum >= 878001 && idnum <= 880000 ||
                    idnum >= 887001 && idnum <= 890000) {
                hexstring = ("14" + idnum);
                // System.out.println(hexstring);
            } else {
                hexstring = string;
            }

            loadtext.append(string + ";" + string + ";User;" + dtf + ";" + Integer.parseInt(hexstring, 16) + ";48bit;Everywhere;Main\n");

        }
        texta.setText(String.valueOf(loadtext));
    }//ConvertAll

    /**
     * Clear all
     */

    public void ClearAll(ActionEvent e) {
        texta.setText("");
        cnvrt.setDisable(true);
    }//Clear all

    /**
     * About
     */

    public void AboutCall(ActionEvent e) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");


        alert.setHeaderText("User DB converter: Libis > Midpoint-CredoID");
        alert.setContentText("Made by:\nAleksandr Surkov\nLinkedin: aleksandr-surkov\n\nFor: amb.lt\n\nLanguage: Java 8\n\nYear: 2019");


        alert.showAndWait();
    }//About

    /**
     * Close program
     */

    public void Exit(ActionEvent e) {
        Platform.exit();
    }//Exit

}//Controller



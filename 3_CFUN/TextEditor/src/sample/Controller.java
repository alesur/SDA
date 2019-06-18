package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

        loadtext.delete(0, loadtext.length());//clear for reuse
        loadtext.append("FirstName;LastName;UserTypeID;ActivationDate;CardCode;CardFormatName;AccessLevel;Location\n");

        for (String string : arr) {

            loadtext.append(string + ";" + string + ";User;" + dtf + ";" + Integer.parseInt(string, 16) + ";48bit;Everywhere;Main\n");

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
     * Close program
     */

    public void Exit(ActionEvent e) {
        Platform.exit();
    }//Exit

}//Controller



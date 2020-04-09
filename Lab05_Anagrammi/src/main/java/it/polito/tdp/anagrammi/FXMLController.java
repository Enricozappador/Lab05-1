package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Parolatxt;

    @FXML
    private Button Calcolabtn;

    @FXML
    private TextArea Correttitxt;

    @FXML
    private TextArea Erratitxt;

    @FXML
    private Button Resetbtn;

    @FXML
    void handleCalculate(ActionEvent event) {

    }

    @FXML
    void handleReset(ActionEvent event) {
    	Parolatxt.clear();
    	Correttitxt.clear();
    	Erratitxt.clear();
    }

    @FXML
    void initialize() {
        assert Parolatxt != null : "fx:id=\"Parolatxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Calcolabtn != null : "fx:id=\"Calcolabtn\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Correttitxt != null : "fx:id=\"Correttitxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Erratitxt != null : "fx:id=\"Erratitxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert Resetbtn != null : "fx:id=\"Resetbtn\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}

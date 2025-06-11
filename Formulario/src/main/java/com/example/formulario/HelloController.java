package com.example.formulario;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class HelloController {

    @FXML
    private VBox rootPane;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        rootPane.getStyleClass().clear();
        rootPane.getStyleClass().add("exito");
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}

package com.example.demo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InicialController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}

package com.example.epos;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainFormController {
    @FXML
    private Label welcomeLabel;

    // You can define additional methods and fields for the main form controller here

    // Example method to set the welcome message
    public void setWelcomeMessage(String username) {
        welcomeLabel.setText("Welcome, " + username + "!");
    }

    // Other methods and event handlers for the main form can be defined here
}


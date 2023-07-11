package com.example.epos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class loginApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML Scene
        FXMLLoader fxmlLoader = new FXMLLoader(loginApp.class.getResource("/com/example/views/loginForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {launch();
    }
}
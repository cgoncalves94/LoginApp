package com.example.epos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;

public class loginApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        boolean isConnected = DatabaseConnection.initialize();

        if (isConnected) {
            System.out.println("Successfully connected to the database.");
        } else {
            System.out.println("Failed to connect to the database.");
        }

        // Now you can use DatabaseConnection.getConnection() whenever you need the connection
        Connection connection = DatabaseConnection.getConnection();
        // ...

        FXMLLoader fxmlLoader = new FXMLLoader(loginApplication.class.getResource("form.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Login!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
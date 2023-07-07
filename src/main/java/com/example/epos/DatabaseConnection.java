package com.example.epos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Static variable to hold the single instance of the DatabaseConnection that will be created
    private static Connection connection;

    // Database connection parameters
    private String url = "jdbc:mysql://localhost:3306/EPOS";
    private String username = "root";
    private String password = "admin";

    // Private constructor to prevent creating multiple instances of DatabaseConnection
    private DatabaseConnection() {
        try {
            // Attempt to establish a connection to the database
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            // If a SQLException is thrown, print the error message
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    // Method to get the established database connection
    public static Connection getConnection() {
        // Returns the connection object
        return connection;
    }

    // Method to initialize the database connection
    public static boolean initialize() {
        // Creates a new instance of DatabaseConnection, which establishes the connection
        new DatabaseConnection();
        // Returns true if the connection was successfully established, false otherwise
        return connection != null;
    }
}

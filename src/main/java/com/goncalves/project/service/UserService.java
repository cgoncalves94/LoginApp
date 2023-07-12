package com.goncalves.project.service;

import com.goncalves.project.dao.UserDAO;
import com.goncalves.project.model.User;

import java.sql.SQLException;


public class UserService {
    private static UserService instance;
    private final UserDAO userDAO;
    private User loggedInUser;
    public UserService() {
        this.userDAO = new UserDAO();
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public User loginUser(String username, String password) {
        User user = userDAO.checkUser(username, password);
        if (user != null) {
            loggedInUser = user;
        }
        return user;
    }

    public boolean registerUser(User user) throws SQLException {
        // Check if a user with the provided username already exists
        if (userDAO.getUserByUsername(user.getUsername())) {
            // A user with the provided username already exists
            return false;
        }
        // If no user with the provided username exists, register a new user
        return userDAO.registerUser(user);
    }

    public User forgotPassword(String username, String question, String answer)  {
        return userDAO.forgotPassword(username, question, answer);
    }
    public boolean changePassword(String username, String newPassword)  {
        return userDAO.changePassword(username, newPassword);
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void logout() throws SQLException {
        userDAO.close();
    }
}

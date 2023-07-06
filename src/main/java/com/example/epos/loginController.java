package com.example.epos;

import com.jfoenix.controls.*;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class loginController {

    @FXML
    private JFXButton changePass_backBtn;

    @FXML
    private JFXPasswordField changePass_cPassword;

    @FXML
    private AnchorPane changePass_form;

    @FXML
    private JFXPasswordField changePass_password;

    @FXML
    private JFXButton changePass_proceedBtn;

    @FXML
    private JFXTextField forgot_answer;

    @FXML
    private JFXButton forgot_backBtn;

    @FXML
    private AnchorPane forgot_forrm;

    @FXML
    private JFXButton forgot_proceedBtn;

    @FXML
    private JFXComboBox<?> forgot_selectQuestion;

    @FXML
    private JFXTextField forgot_username;

    @FXML
    private JFXButton login_button;

    @FXML
    private JFXButton login_createAcc;

    @FXML
    private Hyperlink login_forgotPassword;

    @FXML
    private AnchorPane login_form;

    @FXML
    private JFXPasswordField login_password;

    @FXML
    private JFXCheckBox login_selectShowPassword;

    @FXML
    private JFXTextField login_showPassword;

    @FXML
    private JFXTextField login_username;

    @FXML
    private AnchorPane main_form;

    @FXML
    private JFXTextField signup_answer;

    @FXML
    private JFXButton signup_button;

    @FXML
    private JFXPasswordField signup_cPassword;

    @FXML
    private JFXTextField signup_email;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private JFXButton signup_loginAcc;

    @FXML
    private JFXPasswordField signup_password;

    @FXML
    private JFXComboBox<?> signup_selectQuestion;

    @FXML
    private JFXTextField signup_username;





    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
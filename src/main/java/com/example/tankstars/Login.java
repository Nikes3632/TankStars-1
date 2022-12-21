package com.example.tankstars;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {
    public Login() {

    }

    @FXML
    private Button button;
    @FXML
    private Label WrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void unserlogin(ActionEvent event)throws IOException{
        checklogin();
    }
    private void checklogin()throws IOException{
        HelloApplication m = new HelloApplication();
        SignUp sg = new SignUp();
        if(username.getText().toString().equals("preci")&& password.getText().toString().equals("1234")){
            WrongLogin.setText("Success!!");
            m.changeScene("Play.fmxl");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty()){
            WrongLogin.setText("Please enter your data");
        }
        else{
            WrongLogin.setText("Wrong username or password!");
        }
    }
}

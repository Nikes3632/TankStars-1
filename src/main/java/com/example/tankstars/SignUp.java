package com.example.tankstars;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignUp {
    public void signUp(){

    }
    @FXML
    private Label WrongSignUp;
    @FXML
    private TextField username;
    @FXML
    private PasswordField  password;

    public void UserSignup(ActionEvent event) throws IOException{
        checkSignUp();
    }
    public void checkSignUp() throws IOException{
        HelloApplication m = new HelloApplication();
        String[] name = new String[100];
        int[] pass = new int[4];
        List<String>Name = new ArrayList<String>(Arrays.asList(name));
        Name.add(String.valueOf(username));

        if(username.getText().isEmpty() && password.getText().isEmpty()){
            WrongSignUp.setText("Please Enter your details");
        }
        else{
            WrongSignUp.setText("Sign Up successfully");
        }

    }

}

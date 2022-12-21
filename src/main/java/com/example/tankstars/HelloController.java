package com.example.tankstars;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchScene0(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene0.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void signUP(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void logIN(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("logIN.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void PLAY(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Play.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void EXIT(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("sc.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    /*
    @FXML
    void play(MouseEvent e){
        String filename = "";//name of song
        playHitSound(filename);
    }

    private void playHitSound(String filename) {
        String path = getClass().getResource(filename).getPath();
        System.out.println(path);
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

    }*/
}
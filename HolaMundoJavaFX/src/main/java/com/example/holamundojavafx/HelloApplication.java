package com.example.holamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label Mylabel = new Label("Hello World");
        StackPane root = new StackPane(Mylabel);
        Scene scene = new Scene(root, 200, 200);

        stage.setTitle("Mi primer app en JavaFX!");
        Image img = new Image(getClass().getResourceAsStream("/icons/facebook.png"));
        stage.getIcons().add(img);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
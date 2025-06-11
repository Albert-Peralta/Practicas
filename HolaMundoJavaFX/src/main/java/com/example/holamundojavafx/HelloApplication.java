package com.example.holamundojavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblNombre = new Label("Nombre: ");
        TextField tfNombre = new TextField();
        Label lblComentario = new Label("Comentario");
        TextArea tfComentario = new TextArea();
        Label lblOpciones = new Label("Opciones: ");
        ObservableList<String> opciones = FXCollections.observableArrayList("A", "B", "C");
        ComboBox<String> cmbOpciones = new ComboBox<>(opciones);
        Button btnAceptar = new Button("Aceptar");
        Label lblResultado = new Label();

        btnAceptar.setOnAction(Actionevent -> {
            String nombre = tfNombre.getText();
            String comentario = tfComentario.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            if(nombre.isEmpty() || comentario.isEmpty() || seleccion==null) {
                System.out.println("Todos los campos son obligatorios");
                lblResultado.setText("Todos los campos son obligatorios");
            } else{
                lblResultado.setText("Nombre: " + nombre +"\nComentario: " + comentario +"\nOpciones: " + seleccion);
            }
        });
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblComentario, 0, 1);
        form.add(tfComentario, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnAceptar, 0, 3);
        form.add(lblResultado, 1, 4);

        Scene scene = new Scene(form, 500, 700);

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
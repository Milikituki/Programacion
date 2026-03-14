package com.example.tiendaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // carga la parte gráfica en el FXMLoader
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
        // crea la escena y la asocia a la parte gráfica
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        // pone la escena en la ventana
        stage.setScene(scene);
        // pone el título en la ventana
        stage.setTitle("Tienda JavaFX");
        // muestra la ventana
        stage.show();
    }
}

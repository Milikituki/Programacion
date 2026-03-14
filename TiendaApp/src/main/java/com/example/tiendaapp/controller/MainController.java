package com.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    // necesito tener una variable por cada uno de los elementos del fxml
    // document.querySelector("#id") o document.getElementById("id") --> Esto es para css

    @FXML
    private Button buttonSaludar;
    @FXML
    private TextField editNombre;
    @FXML
    private Text editText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // todos lo codigos que pongo aqui se ejecutan anda mas cargar la parte fxml
        // editText.setText("Esto está chupao");
        buttonSaludar.setOnAction(actionEvent -> {
            String texto = editNombre.getText();
            if (texto.isEmpty()){
                editText.setText("No hay nadie a quien saludar. Por favor, escribe tu nombre. ");
            } else {
                editText.setText("Enhorabuena "+texto+" has completado la app JavaFX");

            }

        });
    }
}

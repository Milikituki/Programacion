package com.example.tiendaapp.controller;

import com.example.tiendaapp.model.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable /*, EventHandler<MouseEvent>, EventHandler<ActionEvent>*/ {

    @FXML
    private Button btnAgregar;
    @FXML
    private TextField editNombre;
    @FXML
    private Button btnComprobar;
    @FXML
    private Button btnVaciar;
    @FXML
    private CheckBox chheckLista;
    @FXML
    private ComboBox<String> comboTipo;
    // necesita una lista de elementos
    private ObservableList<String> perfiles;
    @FXML
    private TextField editApellido;
    @FXML
    private TextField editDNI;
    @FXML
    private TextField editMail;
    @FXML
    private TextField editPass;
    @FXML
    private RadioButton radioFemenino;
    @FXML
    private RadioButton radioMasculino;
    @FXML
    private Spinner<?> spinnerEdad;
    // necesita un modelo(datos) de elementos
    private SpinnerValueFactory modelEdad;
    private DropShadow shadow;
    private ToggleGroup grupoGenero;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        instances();
        initGUI();
        actions();

    }

    private void initGUI() {
        grupoGenero.getToggles().addAll(radioFemenino, radioMasculino);
        radioFemenino.setSelected(true);
        comboTipo.setItems(perfiles);
        spinnerEdad.setValueFactory(modelEdad);
    }

    private void instances() {
        shadow = new DropShadow();
        grupoGenero = new ToggleGroup();
        perfiles = FXCollections.observableArrayList();
        perfiles.addAll("Administrador", "Trabajador", "Usuario");
        modelEdad = new SpinnerValueFactory.IntegerSpinnerValueFactory(18,90,18, 1);
    }


    private void actions() {
        btnAgregar.setOnAction(actionEvent -> {
            String nombre = editNombre.getText();
            String apellido = editApellido.getText();
            String dni = editDNI.getText();
            String mail = editMail.getText();
            String pass = editPass.getText();
            String perfil = comboTipo.getSelectionModel().getSelectedItem();
            int edad = (int) spinnerEdad.getValue();
            String genero =  ((RadioButton) grupoGenero.getSelectedToggle()).getText();

            User user = new User(nombre,apellido,dni,mail,pass,genero,perfil,edad);

        });
//        btnComprobar.setOnMouseEntered(this);
//        btnVaciar.setOnMouseEntered(this);
        btnComprobar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnComprobar.setOnMouseExited(new ManejoRaton());
    }

    /*@Override
    public void handle(MouseEvent mouseEvent) {
        System.out.println("Ratón entrando...");
    }*/

    class ManejoRaton implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent mouseEvent) {
            if(mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED){
                ((Button)mouseEvent.getSource()).setEffect(shadow);
                System.out.println("Ratón entrando");
                if(mouseEvent.getSource() == btnAgregar){
                    System.out.println("Entrando al botón Agregar");
                }
            } else if(mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED){
                ((Button)mouseEvent.getSource()).setEffect(null);
            }

        }
    }
}

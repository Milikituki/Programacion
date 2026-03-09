package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Mensaje;
import model.Usuario;

import java.io.IOException;
import java.net.URL;

public class Gestor {
    public void leerJSON(){
        ObjectMapper mapper = new ObjectMapper();
        long userID = 1;
        try {
            Usuario usuario = mapper.readValue(new URL("https://jsonplaceholder.typicode.com/posts/"+userID), Usuario.class);
            Mensaje mensaje = mapper.readValue(new URL("https://jsonplaceholder.typicode.com/users/"+userID), Mensaje.class);
            usuario.datosMensaje();
            mensaje.mostrarDatos();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

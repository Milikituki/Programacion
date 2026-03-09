package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import model.Producto;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Gestor {
    public void leerJSON(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el ID del producto que quieres buscar: ");
        int id = sc.nextInt();

        try {
            Producto respuesta = mapper.readValue(new URL("https://dummyjson.com/products/" + id).openStream(),
                    Producto.class);
            respuesta.mostrarDatos();


        }catch (MalformedURLException e){
            System.out.println("Error en la url: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer los datos: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("El ID no existe: " + e.getMessage());
        }


    }
}

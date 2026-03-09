package controller;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.*;
import model.Pokemon;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Gestor {
    public void leerJSON(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del Pokémon: ");
        String nombre = sc.nextLine();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            Pokemon pokemon = mapper.readValue(new URL("https://pokeapi.co/api/v2/pokemon/"+nombre).openStream(), Pokemon.class);
            pokemon.mostrarDatos();
        } catch (MalformedURLException e) {
            System.out.println("El Pokémon que buscas no existe");
        } catch (StreamReadException | DatabindException e) {
            System.out.println("Error en el archivo JSON");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

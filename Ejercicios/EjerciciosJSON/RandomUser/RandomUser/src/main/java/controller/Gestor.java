package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Result;
import model.ResultsResponse;
import java.io.IOException;
import java.net.URI;

public class Gestor {
    public void lecturaJSON(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            ResultsResponse respuesta = mapper.readValue(URI.create("https://randomuser.me/api/?results=10").toURL(), ResultsResponse.class);
            respuesta.getResults().forEach(Result::mostrarDatos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package controller;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import model.Result;
import model.Results;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Gestor {
    public void leeerJSON(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        try {
            Results resultados = mapper.readValue(new URL("https://opentdb.com/api.php?amount=3&type=multiple").openStream(), Results.class);
            resultados.getResults().forEach(Result::mostrarResultados);
        } catch (MalformedURLException | DatabindException | StreamReadException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

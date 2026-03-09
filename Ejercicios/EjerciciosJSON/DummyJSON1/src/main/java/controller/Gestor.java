package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import model.Product;
import model.Products;

import java.io.IOException;
import java.net.URL;

public class Gestor {
    public void lecturaJSON(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        Products products;

        {
            try {
                products = mapper.readValue(new URL("https://dummyjson.com/products?limit=5").openStream(), Products.class);
                products.getProducts().forEach(Product::mostrarDatos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

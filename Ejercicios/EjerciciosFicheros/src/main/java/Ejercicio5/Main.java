package Ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del archivo: ");
        String ruta = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            System.out.println("El número de líneas que contiene el archivo es de: " + contador);
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo: " + e.getMessage());
        }
    }
}

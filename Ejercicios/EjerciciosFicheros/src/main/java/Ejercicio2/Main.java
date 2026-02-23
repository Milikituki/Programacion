package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos la ruta del archivo
        System.out.print("Introduce la ruta del archivo: ");
        String ruta = sc.nextLine();

        // Pedimos la palabra a buscar
        System.out.print("Introduce la palabra a buscar: ");
        String palabra = sc.nextLine();

        // Convertimos la palabra a minúsculas para no distinguir mayúsculas/minúsculas
        palabra = palabra.toLowerCase();

        int contador = 0;

        try {
            // Abrimos el archivo para lectura
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            String linea;

            // Leemos línea por línea
            while ((linea = br.readLine()) != null) {

                // Convertimos la línea a minúsculas
                linea = linea.toLowerCase();

                // Dividimos la línea en palabras usando espacios y signos básicos
                String[] palabras = linea.split("[\\s.,;:¡!¿?\"()]+");

                // Recorremos el array de palabras
                for (String p : palabras) {
                    if (p.equals(palabra)) {  // Coincidencia exacta
                        contador++;
                    }
                }
            }

            br.close();

            System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces.");

        } catch (IOException e) {
            // Error si el archivo no existe o no se puede leer
            System.out.println("Error al abrir el archivo. Comprueba la ruta.");
        }

        sc.close();
    }
}

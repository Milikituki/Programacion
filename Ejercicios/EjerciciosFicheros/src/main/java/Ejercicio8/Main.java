package Ejercicio8;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del archivo: ");
        String ruta = sc.nextLine();

        Map<String, Integer> frecuencias = new HashMap<>();
        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Eliminar signos de puntuación y pasar a minúsculas
                String lineaLimpia = linea.replaceAll("[^a-záéíóúüñA-ZÁÉÍÓÚÜÑ ]", " ");
                String[] palabras = lineaLimpia.trim().split("\\s+");

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        String p = palabra.toLowerCase();
                        frecuencias.put(p, frecuencias.getOrDefault(p, 0) + 1);
                        totalPalabras++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            return;
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo.");
            return;
        }

        System.out.println("\nTotal de palabras: " + totalPalabras);

        // Ordenar por frecuencia descendente y tomar las 5 primeras
        System.out.println("\nTop 5 palabras más frecuentes:");
        frecuencias.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(5)
                .forEach(e -> System.out.println("  \"" + e.getKey() + "\" -> " + e.getValue() + " veces"));
    }
}
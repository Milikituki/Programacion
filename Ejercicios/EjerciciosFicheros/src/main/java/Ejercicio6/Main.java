package Ejercicio6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/main/java/Ejercicio6/archivo.csv")));
             BufferedReader br = new BufferedReader(new FileReader("src/main/java/Ejercicio6/archivo.csv"))) {
            pw.println("Nombre,Edad,Calificación");
            pw.println("Ana García,20,8.5");
            pw.println("Carlos Martin,19,7.9");
            pw.println("Laura Pérez,21,9.3");
            pw.flush();

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
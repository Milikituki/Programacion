package Ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ruta del archivo de origen: ");
        String path1 = sc.nextLine();
        System.out.print("Ruta del archivo de destino: ");
        String path2 = sc.nextLine();
        File file1 = new File(path1);
        File file2 = new File(path2);
        try (BufferedReader reader = new BufferedReader(new FileReader(file1)); PrintWriter out = new PrintWriter(new FileWriter(file2))) {
            try {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo de origen "+e.getMessage());
            }
        } catch (IOException | NullPointerException e) {
            System.out.println("Error al cerrar el archivo "+e.getMessage());
        }
    }
}

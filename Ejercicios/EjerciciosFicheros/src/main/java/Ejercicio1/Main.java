package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del archivo: ");
        String ruta = sc.nextLine();
        File file = new File(ruta);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String linea;
            System.out.println("Contenido del archivo: ");
            while((linea = br.readLine())!= null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            System.out.print("Introduce la ruta del archivo: ");
            ruta = sc.nextLine();
        } catch (IOException e) {
            System.out.println("Error: No se pudo leer el archivo.");
            System.out.print("Introduce otra ruta del archivo o administra los permisos: ");
            ruta = sc.nextLine();

        }finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error: No se pudo cerrar el archivo.");
            }
        }
    }
}

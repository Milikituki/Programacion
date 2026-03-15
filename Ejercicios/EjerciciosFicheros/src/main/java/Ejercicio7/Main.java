package Ejercicio7;

import java.io.File;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta: ");
        String ruta = sc.nextLine();

        File file = new File(ruta);
        if (!file.exists()) {
            System.out.println("La ruta no existe");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println("[DIRECTORIO] " + file.getName());
            mostrarArchivos(file, 0);
        }
    }

    public static void mostrarArchivos(File directorio, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        File[] archivos = directorio.listFiles();
        if (archivos == null) {
            return;
        }
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.printf("""
                        -[DIRECTORIO] %s (%d bytes)\n""", archivo.getName(), archivo.length());
                mostrarArchivos(archivo, nivel + 1);
            } else {
                System.out.printf("""
                        -[ARCHIVO] %s (%d bytes)\n""", archivo.getName(), archivo.length());
            }
        }
    }

}

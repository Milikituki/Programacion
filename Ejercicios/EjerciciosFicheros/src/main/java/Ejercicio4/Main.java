package Ejercicio4;

import java.io.File;
import java.util.Date;

public class Main {
    static void main(String[] args) {
        File archivo = new File("/Users/miriam/Desktop/Ejercicio4.rtf");
        long timestamp = archivo.lastModified();
        Date fecha = new Date(timestamp);

        if (!archivo.exists()) {
            System.out.println("El archivo especificado en la ruta no existe");
            return;
        }
        System.out.printf("""
                Información del archivo %s
                Tamaño: %d bytes
                Última modificación: %s
                Permisos:
                    Lectura: %s
                    Escritura: %s
                    Ejecución: %s
                Archivo oculto: %s
                Ruta absoluta: %s""", archivo.getName(), archivo.length(),
                fecha, archivo.canRead(), archivo.canWrite(),
                archivo.canExecute(), archivo.isHidden(), archivo.getAbsolutePath());
    }
}

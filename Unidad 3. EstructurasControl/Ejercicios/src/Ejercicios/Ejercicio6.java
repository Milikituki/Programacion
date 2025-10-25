package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public void e6(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = s.nextInt();

        if (edad>=16){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado. Debes tener al menos 16 años");
        }
    }
}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public void e7(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double nota = s.nextDouble();
        boolean suspenso = nota<5;
        boolean aprobado = nota<7;
        boolean notable = nota<9;
        boolean sobresaliente = nota<=10;
        boolean correcto = nota>0 && nota<10;

        if (correcto){
            if (suspenso){
                System.out.println("Tu calificación es: Suspenso");
            } else if (aprobado){
                System.out.println("Tu calificación es: Aprobado");
            } else if (notable){
                System.out.println("Tu calificación es: Notable");
            } else {
                System.out.println("Tu calificación es: Sobresaliente");
            }
        } else{
            System.out.println("Introduce una calificación válida (0-10)");
        }
    }
}

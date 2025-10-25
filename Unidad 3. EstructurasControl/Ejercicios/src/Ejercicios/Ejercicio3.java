package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public void e3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        double nota = s.nextDouble();

        if (nota>=5){
            System.out.println("¡Enhorabuena! Has aprobado.");
        } else {
            System.out.println("¡Lástima! Has suspendido.");
        }
    }
}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public void e2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = s.nextInt();

        if (numero == 0) {
            System.out.println("El número es 0");
        } else if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public void e8(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = s.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = s.nextInt();

        boolean iguales = num1==num2;
        boolean mayor = num1>num2;

        if (iguales){
            System.out.printf("El número %d es igual que %d", num1, num2);
        } else if (mayor){
            System.out.printf("El número %d es mayor que %d", num1, num2);
        } else {
            System.out.printf("El número %d es menor que %d", num1, num2);
        }
    }
}

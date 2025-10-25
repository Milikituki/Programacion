package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public void e9(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg: ");
        double peso = s.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        double altura = s.nextDouble();

        double IMC = peso/(altura*altura);
        boolean normal = IMC >= 18.5 && IMC <= 24.9;
        boolean bajo = IMC < 18.5;
        boolean alto = IMC > 24.9;

        if (bajo){
            System.out.printf("Tu IMC es: %.2f %nEstás por debajo del peso normal.",IMC);
        } else if (alto){
            System.out.printf("Tu IMC es: %.2f %nEstás por encima del peso normal.",IMC);
        } else {
            System.out.printf("Tu IMC es: %.2f %nEstás en peso normal.",IMC);
        }
    }
}

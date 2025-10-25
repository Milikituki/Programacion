package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    //pedir edad usuario
    //determinar si es mayor edad (+=18)
    //mensaje: puede votar o no
    public void ejercicio1(){

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = s.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("Eres menor de edad. NO puedes votar");
        }

    }


}

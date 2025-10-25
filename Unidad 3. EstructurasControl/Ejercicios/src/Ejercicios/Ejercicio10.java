package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public void e10(){
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce tu altura en cm: ");
        int altura = s.nextInt();

        boolean bajo = altura<120;
        boolean alto = altura>200;

        if (bajo){
            System.out.println("No puedes subir a la atracción. Altura mínima: 120cm");
        }else if (alto){
            System.out.println("No puedes subir a la atracción. Altura máxima: 200cm");
        }else{
            System.out.println("Puedes subir a la atracción.");

        }
    }
}

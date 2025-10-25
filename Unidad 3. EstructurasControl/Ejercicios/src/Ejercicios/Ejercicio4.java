package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public void e4(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra: ");
        double compra = s.nextDouble();

        double descuento = compra-(compra*0.9);
        double subtotal = compra-descuento;

        if (compra>=100){
            System.out.printf("""
                    Importe original: %.1f
                    Descuento aplicado: %.1f€
                    Importe final: %.1f€
                    """, compra, descuento, subtotal);
        } else {
            System.out.println("Importe final: "+compra+"€");
        }
    }
}

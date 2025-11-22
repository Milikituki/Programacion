package EjerciciosArrayUnidimensionales;

import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);
    public void ejercicio1(){
        /*Crea un programa que defina un array llamado frutas con 5 nombres de frutas. Luego, muestra todos los elementos del array en la consola, uno por línea.*/

        String[] frutas = new String[]{"manzana", "plátano", "pera", "tomate", "piña"};
        for (String item : frutas) {
            System.out.println(item);

        }
    }
    public void ejercicio2(){
       /* Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer el array y mostrar cada número junto con su posición (índice).  */
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posición %d: %d%n", i, numeros[i]);

        }
    }
    public void ejercicio3(){
        /*Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario que introduzca 5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados. */
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Introduce el nombre %d: ", i+1);
            String nombre = "";
            nombre = scanner.nextLine();
            nombres[i] = nombre;
        }
        System.out.println("Nombres introducidos: ");
        for (String item : nombres) {
            System.out.println(item);
        }
    }


}

package EjerciciosArrayUnidimensionales;

import java.lang.reflect.Array;
import java.util.Arrays;
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
            String nombre = ""; // creas una variable "individual" donde se va a guardar un nombre
            nombre = scanner.nextLine();
            nombres[i] = nombre; // dentro del array guardas cada nombre individual en la posicion que le toque
        }
        System.out.println("Nombres introducidos: ");
        for (String item : nombres) {
            System.out.println(item);
        }
    }
    public void ejercicio4(){
        /*Crea un programa con un array de 7 números. Pide al usuario un número a buscar y usa un bucle for para recorrer el array. Si el número existe, muestra su posición. Si no existe, indica que no se encontró.*/

        int[] numero = new int[7];
        for (int i = 0; i < numero.length; i++) {
            int numeroIndividual = (int) (Math.random()*25)+1;
            numero[i] = numeroIndividual;
        }
        System.out.printf("Array: %s%n", Arrays.toString(numero));
        System.out.printf("Introduce el número que quieras buscar: ");
        int numeroBuscar = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i<numero.length; i++) {
            if (numeroBuscar == numero[i]){
                System.out.printf("El número %d se encuentra en la posición %d", numeroBuscar, i);
                encontrado = true;
                break;
            }
            if (!encontrado){
                System.out.printf("El número %d no se encuentra en el array", numeroBuscar);
                break;
            }
        }
    }


}

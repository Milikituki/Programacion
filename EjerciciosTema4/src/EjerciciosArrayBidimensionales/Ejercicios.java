package EjerciciosArrayBidimensionales;

import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);
    public void e1(){
        int[][] matriz = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

    }
    public void e2(){
        int[][] matriz = new int[2][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el valor para la posición [%d][%d]: ",i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }

    }
    public void e3(){
        int[][] matriz = new int[][]{{2,4,6,8},{1,3,5,7},{9,11,13,15},{10,12,14,16}};
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("La suma total de los elementos es: "+suma);

    }
    public void e4(){
        int[][] matriz = new int[][]{{12,45,23,67,89},{34,56,78,90,11},{22,33,44,55,66}};
        System.out.print("Introduce el número que quieres buscar: ");
        int searchedNum = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (searchedNum == matriz[i][j]){
                    encontrado = true;
                    System.out.printf("El número %d se encuentra en la posición [%d][%d]", searchedNum, i, j);
                    break;
                }
            }
        }
        if (!encontrado) {
            System.out.print("El número no se encuentra en la matriz.");
        }
    }
    public void e5(){
        double[][] matriz = {{5.5,7.2,6.8},{8.1,9.3,7.5},{4.2,5.6,6.1},{7.8,8.9,9.2}};
        for (int i = 0; i < matriz.length; i++) {
            double suma = 0; // se inicializa en 0 en cada fila, para que se resetee el valor y no lo acumule al acabar la fila
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            System.out.printf("Promedio de la fila %d: %.1f\n", i, suma/3);
        }
    }
    public void e6(){
        int[][]matriz ={
                {15,23,8,19},
                {42,17,31,25},
                {28,35,12,40}};
        for (int i = 0; i < matriz[0].length; i++) { //empezamos a recorrer desde la columna 0
            int mayor = matriz[0][i]; //inicializamos la variable con el valor de la primera fila y la columna que toque
            for (int j = 0; j < matriz.length; j++) { //recorremos las filas
                if(matriz[j][i] > mayor){ //si el valor de la fila y columna que toquen es mayor que el valor de la primera fila, columna que toque...
                    mayor = matriz[j][i]; // entonces la variable mayor se convertirá en ese valor.
                }
            }
            System.out.printf("El número más grande de la columna %d es: %d\n", i, mayor); // aquí i es la columna
        }
    }
    public void e7(){
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.printf("%d\t", matriz[j][i]);
            }
            System.out.println();
        }

    }

}

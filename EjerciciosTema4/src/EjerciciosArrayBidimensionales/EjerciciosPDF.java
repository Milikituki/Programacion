package EjerciciosArrayBidimensionales;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosPDF {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public void e1(){
        System.out.print("¿Cuántas filas quieres que tenga la matriz 1? ");
        int filas = scanner.nextInt();
        System.out.print("¿Cuántas columnas quieres que tenga la matriz 1? ");
        int columnas = scanner.nextInt();
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = random.nextInt(51);
                matriz2[i][j] = random.nextInt(51);
            }
        }
        System.out.println("--- MATRIZ 1 ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%d\t", matriz1[i][j]);
            }
            System.out.println();
        }
        System.out.println("--- MATRIZ 2 ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%d\t", matriz2[i][j]);
            }
            System.out.println();
        }
        int[][] sumaMatrices = new int[filas][columnas];
        System.out.println("--- SUMA MATRICES ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.printf("%d\t", sumaMatrices[i][j]);
            }
            System.out.println();
        }
        
        
        
    }
    public void e2(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.printf("""
                --- MENÚ ---
                1. Imprimir Array
                2. Mover Izquierda
                3. Mover derecha
                4. Invertir
                5. Salir
                """);
        boolean salir = false;
        int opcion = 0;
        do {
            System.out.printf("%nQué acción quieres realizar? ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> System.out.printf(Arrays.toString(array));
                case 2 -> moverIzquierda(array);
                case 3 -> moverDerecha(array);
                case 4 -> invertir(array);
                case 5 -> System.out.print("Saliendo del programa...");
                default -> System.out.print("Opción no permitida");

            }
        } while (opcion!=5);
    }
    private void moverIzquierda(int[] arrayP){
        int posicion = arrayP[0];
        for (int i = 0; i < 8; i++) {
           arrayP[i] = arrayP[i+1];
           arrayP[arrayP.length-1] = posicion;
        }
        System.out.printf(Arrays.toString(arrayP));
    }
    private void moverDerecha(int[] arrayP){
        int ultimaPosicion = arrayP[9];
        for (int i = 8; i >= 0; i--) {
            arrayP[i+1] = arrayP[i];
        }
        arrayP[0] = ultimaPosicion;
        System.out.printf(Arrays.toString(arrayP));
    }
    private void invertir(int[] arrayP){

        for (int i = 0; i < arrayP.length/2; i++) {
           int silla = arrayP[i];
            arrayP[i] = arrayP[arrayP.length-i-1];
            arrayP[arrayP.length-i-1] = silla;
        }
        System.out.printf(Arrays.toString(arrayP));
    }
}

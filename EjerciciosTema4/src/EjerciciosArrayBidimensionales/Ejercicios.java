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
        for (int i = 0; i < 4; i++) { //4 es el numero de columnas que hay
            for (int j = 0; j < matriz.length; j++) {

                System.out.printf("%d\t", matriz[j][i]);
            }
            System.out.println();
        }

    }
    public void e8(){
        int[][] matriz = {
                {12,15,8,23,24},
                {17,20,9,14,27},
                {6,11,18,25,30},
                {13,22,7,16,19}};
        int pares, impares;
        pares = impares = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero%2==0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        System.out.print("Números pares: "+pares+ "\n");
        System.out.print("Números impares: "+impares);

    }
    public void e9(){
        int[][] matriz = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i+1)*(j+1);
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public void e10(){
        System.out.print("¿Cuántos estudiantes hay? ");
        int estudiantes = scanner.nextInt();
        System.out.print("¿Cuántas asignaturas hay? ");
        int asignaturas = scanner.nextInt();
        double [][] matriz = new double[estudiantes][asignaturas];
        double[] sumaEstudiante = new double[estudiantes];
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0.0;
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf("Introduce la nota del estudiante %d, asignatura %d: ", i+1, j+1);
                double nota = scanner.nextDouble();
                matriz[i][j] = nota;
                suma += nota;
            }
            sumaEstudiante[i] = suma;
        }
        System.out.println("---TABLA DE NOTAS ---");
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                System.out.printf("%5.1f\t", matriz[i][j]); // El 5 es el espacio entre cada número que se imprima, para que queden alineados uno debajo del otro
            }
            System.out.println();
        }
        System.out.println("--- PROMEDIOS POR ESTUDIANTES ---");
        for (int i = 0; i < estudiantes; i++) {
            double suma = sumaEstudiante[i];
            System.out.printf("Estudiante %d: %.1f%n", i+1, suma/asignaturas);
        }
        System.out.println("--- NOTA MÁS ALTA ---");
        double mayor = 0.0;
        int estudiante = 0;
        int asignatura = 0;
        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < asignaturas; j++) {
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                    estudiante = i+1;
                    asignatura = j+1;
                }
            }
        }
        System.out.printf("La nota más alta es: %.1f (estudiante %d, asignatura %d).", mayor, estudiante, asignatura);
    }

}

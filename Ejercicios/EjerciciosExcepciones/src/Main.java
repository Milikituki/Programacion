import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*// Pide a usuario 2 numeros para dividirlos, t-c para AE
        System.out.print("Introduce el operando 1 (sin decimales): ");
        int op1 = sc.nextInt();
        System.out.print("Introduce el operando 2 (sin decimales): ");
        int op2 = sc.nextInt();
        BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;
        //Si es double en vez de integer NO da fallo
        try {
            System.out.println(division.apply(op1, op2));
        } catch (ArithmeticException e) {
            System.out.println("Error: El dividendo no puede ser 0");
        }*/

        /*//Array de 5 elementos (int), pide al usuario posicion y muestra elemento. T-c para AOOBE
        int[] listaNums = {1, 2, 3, 4, 5};
        System.out.print("Introduce la posición del elemento que quieres buscar: ");
        int posicion = sc.nextInt();
        try {
            System.out.println("Elemento en la posición " + posicion + ": " + listaNums[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La posición se encuentra fuera de los límites del array");
        }*/

        /*//Pide a usuario un numero para pasarlo a texto con Integer.parseInt(), t-c de NFE y do-while
        boolean valido = true;
        do {
            System.out.print("Introduce un numero entero: ");
            String numero = sc.next();
            try {
                System.out.println("Has introducido el número: " + Integer.parseInt(numero));
            } catch (NumberFormatException e) {
                System.out.println("Error: No es un número válido");
                valido = false;
            }
        } while (!valido);*/

        /*//Clase EdadInvalidaException si la edad es menor que 0 o mayor que 120, pedir edad y t-c
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        try {
            validarEdad(edad);
            System.out.println("Tu edad es válida: " + edad+ " años");
        } catch (EdadInvalidaException e) {
            System.out.println( e.getMessage() );
        }*/

        //
        try {
            System.out.print("Introduce el primer número: ");
            int num1 = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            int num2 = sc.nextInt();

            System.out.print("Introduce la operación (+, -, *, /): ");
            String operacion = sc.next();

            int resultado = 0;

            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operación no válida");
                    return;
            }

            System.out.println("Resultado: " + num1 + " " + operacion + " " + num2 + " = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir números válidos");
        } finally {
            System.out.println("Fin del programa");
        }

    }
    public static void validarEdad(int edad) throws EdadInvalidaException{
        if(edad<0){
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        if(edad>120){
            throw new EdadInvalidaException("La edad no puede ser mayor a 120");
        }

    }
}

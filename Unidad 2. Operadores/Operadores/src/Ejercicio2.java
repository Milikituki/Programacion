import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = scn.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scn.nextInt();
        boolean mayor = num1>num2;
        boolean mayorIgual = num1>=num2;
        boolean menor = num1<num2;
        boolean menorIgual = num1<=num2;
        boolean igual = num1==num2;
        boolean diferente = num1!=num2;
        System.out.printf("""
                ¿%d es mayor que %d? %b
                ¿%d es mayor o igual que %d? %b
                ¿%d es menor que %d? %b
                ¿%d es menor o igual que %d? %b
                ¿%d es igual que %d? %b
                ¿%d es diferente de %d? %b
                """
                ,num1, num2, mayor
                ,num1, num2, mayorIgual
                ,num1, num2, menor
                ,num1, num2, menorIgual
                ,num1, num2, igual
                ,num1, num2, diferente
                );
    }
}

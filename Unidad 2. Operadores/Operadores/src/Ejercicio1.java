import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = scn.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = scn.nextDouble();
        double s = num1+num2;
        double r = num1-num2;
        double m = num1*num2;
        double d = num1/num2;
        double p = num1%num2;
        System.out.printf("""
                Suma: %.0f
                Resta: %.0f
                Multiplicación: %.0f
                División: %.2f
                Módulo (resto): %.2f
                """, s, r, m, d, p);
        scn.close();
    }
}

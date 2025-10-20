import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int n1 = s.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int n2 = s.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int n3 = s.nextInt();

        sumar(n1,n2,n3);
        promedio(n1,n2,n3);
        myp(n1,n2,n3);

    }
    public static void sumar(int n1, int n2, int n3){
        int resultado = n1+n2+n3;
        System.out.println("Suma de los tres números: "+resultado);
    }
    public static void promedio(int n1, int n2, int n3) {
        double resultado = (n1 + n2 + (double)n3) / 3;
        System.out.printf("Promedio: %.2f",resultado);

    }
    public static void myp(int n1, int n2, int n3) {
        double resultado = (n1*n2)/(double)n3;
        System.out.printf("""
                %nResultado de (%d * %d)/%d: %.2f
                """,n1,n2,n3,resultado);

    }
}

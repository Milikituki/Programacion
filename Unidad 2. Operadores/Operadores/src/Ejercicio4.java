import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = s.nextInt();
        boolean modulo = n%2==0;
        if (modulo){
            System.out.println("El número "+n+" es par");
        }
        else {
            System.out.println("El número "+n+" es impar");
        }
    }
}

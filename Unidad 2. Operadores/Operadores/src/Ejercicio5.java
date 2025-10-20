import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = s.nextInt();
        System.out.println("¿Tienes carnet de conducir? (true/false)");
        boolean carnet =s.nextBoolean();
        boolean apto = edad>=21 && carnet;
        System.out.printf("""
                ¿Eres mayor de 21 años? %b
                ¿Tienes carnet? %b
                ¿Puedes alquilar un coche? %b
                """, edad, carnet, apto);
    }
}

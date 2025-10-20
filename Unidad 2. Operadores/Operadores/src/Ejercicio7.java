import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = s.nextInt();
        System.out.println("¿Eres estudiante? (true/false)");
        boolean estudiante = s.nextBoolean();

        boolean descJoven = edad<26;
        boolean descEstudiante = estudiante;
        boolean descEspecial = descEstudiante && descJoven;

        System.out.printf("""
                ¿Eres menor de 26 años? %b
                ¿Eres estudiante? %b
                ¿NO eres estudiante? %b
                ¿Tienes descuento joven? %b
                ¿Tienes descuento estudiante? %b
                ¿Tienes descuento especial? %b
                """, descJoven, estudiante, !estudiante, descJoven, descEstudiante, descEspecial);
    }
}

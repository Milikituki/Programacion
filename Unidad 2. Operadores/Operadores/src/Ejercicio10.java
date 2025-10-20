import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el salario por horas: ");
        double salario = s.nextDouble();
        System.out.println("Introduce las horas trabajadas: ");
        int horas = s.nextInt();
        System.out.println("¿Has hecho horas extra? (true/false) ");
        boolean extras = s.nextBoolean();

        double horasExtra = horas-40;
        double salarioBase = salario*(horas-horasExtra);
        boolean doble = extras && (horas>40);
        double pagaExtra = horasExtra*2*salario;
        double total = pagaExtra+salarioBase;

        System.out.printf("""
                Horas normales: %d
                Horas extra: %.1f
                ¿Trabajaste más de 40 horas? %b
                ¿Tienes derecho a horas extra? %b
                ¿Se aplican horas extra? %b
                Salario por horas normales: %.2f€
                Salario por horas extra: %.2f€
                Salario total: %.2f€
                """,
                horas, horasExtra, extras, extras,
                doble, salarioBase, pagaExtra, total);


    }
}

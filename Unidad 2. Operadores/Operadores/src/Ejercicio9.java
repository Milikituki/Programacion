import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double n1 = s.nextDouble();
        System.out.println("Introduce la nota del segundo examen: ");
        double n2 = s.nextDouble();
        System.out.println("Introduce la nota del tercer examen: ");
        double n3 = s.nextDouble();

        double notaMedia = (n1+n2+n3)/3;
        boolean aprobar = notaMedia>=5;
        boolean notable = notaMedia>=7;
        boolean exc = notaMedia>=9;

        System.out.printf("""
                Nota media: %.2f
                ¿Ha aprobado? %b
                ¿Tiene notable? %b
                ¿Tiene sobresaliente? %b
                """, notaMedia, aprobar, notable, exc);
    }
}

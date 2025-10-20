import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double price = s.nextDouble();
        System.out.println("Introduce el porcentaje de descuento: ");
        double disc = s.nextDouble();
        double discApplied = (disc/100)*price;
        double finalPrice = price-discApplied;
        System.out.printf("""
                Precio original: %.2f
                Descuento (%.0f%%): %.2f
                Precio final: %.2f
                """, price, disc, discApplied, finalPrice);
    }
}

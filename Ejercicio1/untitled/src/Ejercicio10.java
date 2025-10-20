public class Ejercicio10 {
    public static void main(String[] args) {
        int tC = 25;
        convertir(tC);
    }
    public static void convertir(int temperatura){
        int conversion = temperatura * 9/5 + 32;
        System.out.printf("""
                Temperatura en Celsius: %s
                Temperatura en Fahrenheit: %s""", temperatura, conversion);
    }
}

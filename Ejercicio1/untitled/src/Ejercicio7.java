public class Ejercicio7 {
    public static void main(String[] args) {
        presentar("Miriam", "Fernández", 31, "Mallorca");

    }
    public static void presentar(String nombre, String apellido, int edad, String ciudad){
        System.out.printf("""
                ¡Hola! Me llamo %s %s.
                Tengo %s años y vivo en %s.""",nombre, apellido, edad, ciudad);
    }
}

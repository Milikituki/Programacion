public class Ejercicio9 {
    public static void main(String[] args) {
        String nombreP = "Auriculares Bluetooth";
        float precioP = 29.99f;
        String codigoP = "AUR-2023";
        boolean disponible = true;

        informar(nombreP,precioP, codigoP, disponible);
    }
    public static void informar(String nombre, float precio, String codigo, boolean disponible){
        System.out.printf("""
                INFORMACIÓN DEL PRODUCTO
                --------------------------
                Nombre: %s
                Precio: %s€
                Código: %s
                Disponible: %s""", nombre,precio,codigo,disponible);
    }
}

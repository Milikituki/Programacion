public class Ejercicio4 {
    public static void main(String[] args) {
        String tituloLibro = "Don Quijote de la Mancha";
        String autorLibro = "Miguel de Cervantes";
        int anioPublicacion = 1605;
        int numPags = 863;
        boolean biblioteca = true;

        System.out.printf("""
                Título: %s
                Autor: %s
                Año de publicación: %s
                Número de páginas: %s
                ¿Disponible en biblioteca? %s
                """, tituloLibro, autorLibro, anioPublicacion, numPags, biblioteca);
    }
}

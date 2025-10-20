public class Ejercicio5 {
    public static void main(String[] args) {
        final String APLICACION = "MiApp";
        System.out.println("Aplicación: "+APLICACION);
        String versionApp = "1.0.0";
        System.out.println("Versión: "+versionApp);
        final double PI = 3.14159;
        System.out.println("Valor de PI: "+PI);
        String usuario = "Laura";
        System.out.println("Usuario actual: "+usuario);
        int nivel = 1;
        System.out.println("Nivel: "+nivel);
        int puntuacion = 0;
        System.out.println("Puntuación: "+puntuacion);
        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;
        System.out.printf("""
                Usuario actualizado: %s
                Nivel actualizado: %s
                Puntuación actualizada: %s
                """, usuario, nivel, puntuacion);



    }
}

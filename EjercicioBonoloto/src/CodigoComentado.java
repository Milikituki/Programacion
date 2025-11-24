import java.util.Arrays;
import java.util.Scanner;
public class CodigoComentado {


        // Array que almacenará los 5 números aleatorios generados por el sistema
        private int[] numerosSistema = new int[5];

        // Array que almacenará los 5 números introducidos por el usuario
        private int[] numerosUsuario = new int[5];

        // Scanner para leer valores del usuario por consola
        private Scanner scanner = new Scanner(System.in);

        // Método para mostrar los números generados por el sistema
        public void verNumerosSistema() {
            System.out.printf("Los números generados son: %s%n", Arrays.toString(numerosSistema));
        }

        // Método para generar 5 números aleatorios entre 1 y 20 sin repetición
        public void generarNumerosSistema2() {
            int contador = 0; // cuántos números válidos se han añadido al array
            int temporal = 0; // el número generado en cada intento

            do {
                // Generamos un número aleatorio entre 1 y 20
                temporal = (int) (Math.random() * 20) + 1;

                boolean repetido = false; // bandera para saber si el número ya existe

                // Comprobamos si el número ya está en el array
                for (int i : numerosSistema) {
                    if (temporal == i) {
                        repetido = true; // el número está repetido
                        break;           // salimos del bucle
                    }
                }

                // Si no está repetido, lo guardamos en el array
                if (!repetido) {
                    numerosSistema[contador] = temporal;
                    contador++; // aumentamos contador de números válidos insertados
                }

            } while (contador < 5); // repetimos hasta tener 5 números
        }

        // Método para pedir al usuario que introduzca 5 números válidos entre 1 y 20
        public void pedirNumerosUsuario() {
            for (int i = 0; i < numerosUsuario.length; i++) {

                int numero;

                do {
                    System.out.print("Introduce un valor: ");
                    numero = scanner.nextInt();

                    // Validación del número (entre 1 y 20)
                    if (numero < 1 || numero > 20) {
                        System.out.println("Este numero no es válido");
                    }

                } while (numero < 1 || numero > 20); // repetir si el número no es válido

                numerosUsuario[i] = numero; // guardamos el número válido en el array
            }
        }

        // Método para comprobar cuántos aciertos tiene el usuario
        public void comprobarAciertos() {
            int aciertos = 0; // contador de aciertos totales

            // Comparamos cada número del sistema con cada número del usuario
            for (int i : numerosSistema) {
                for (int j : numerosUsuario) {
                    if (i == j) { // si encontramos una coincidencia...
                        aciertos++; // sumamos 1 acierto
                        break;      // evitamos contar más veces el mismo número del sistema
                    }
                }
            }

            // Mostramos cuántos aciertos ha tenido el usuario
            System.out.printf("El número de aciertos es: %d%n", aciertos);

            // Switch moderno que devuelve el premio según los aciertos
            String premio = switch (aciertos) {
                case 1, 2 -> "10";         // 1 o 2 aciertos = 10€
                case 3 -> "1.000";         // 3 aciertos = 1000€
                case 4 -> "10.000";        // 4 aciertos = 10.000€
                case 5 -> "1.000.000";     // 5 aciertos = 1 millón
                default -> null;           // 0 aciertos → sin premio
            };

            // Mostramos el resultado según si hay premio o no
            if (premio == null) {
                System.out.print("Suerte la próxima vez");
            } else {
                System.out.printf("Premio: %s€", premio);
            }
        }


}

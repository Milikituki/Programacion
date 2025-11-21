import java.util.Arrays;
import java.util.Scanner;

public class Bonoloto {
    private int[] numerosSistema = new int[5];
    private int[] numerosUsuario = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public void verNumerosSistema() {

        System.out.printf("Los números generados son: %s%n", Arrays.toString(numerosSistema));

    }
    public void generarNumerosSistema2() {
        int contador = 0;
        int temporal = 0;

        do {
           temporal = (int) (Math.random() * 20) + 1;
           boolean repetido = false;
            for (int i : numerosSistema) {
                if (temporal == i) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido){
                numerosSistema[contador] = temporal;
                contador++; // cuantas veces has metido un número válido, cuando llega a 5 para
            }
        }while(contador<5);

    }
    public void pedirNumerosUsuario() {
        for (int i = 0; i < numerosUsuario.length; i++) {
            int numero;
            do {
                System.out.print("Introduce un valor: ");
                numero = scanner.nextInt();
                if (numero<1 || numero>20){
                    System.out.println("Este numero no es válido");
                }
            } while (numero<1 || numero>20);
            numerosUsuario[i] = numero;
        }
    }
    public void comprobarAciertos(){
        int aciertos = 0;
        for (int i : numerosSistema) {
            for (int j : numerosUsuario) {
                if (i == j) {
                    aciertos++;
                    break;
                }
            }
        }

        System.out.printf("El número de aciertos es: %d%n", aciertos);
        String premio = switch (aciertos){
            case 1,2 -> "10";
            case 3 -> "1.000";
            case 4 -> "10.000";
            case 5 -> "1.000.000";
            default -> null;
        };
        if (premio == null){
            System.out.print("Suerte la próxima vez");
        } else {
            System.out.printf("Premio: %s€", premio);
        }

    }
}

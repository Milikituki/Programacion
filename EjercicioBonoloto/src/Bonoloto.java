import java.util.Scanner;

public class Bonoloto {
    private int[] numerosSistema = new int[5];
    private int[] numerosUsuario = new int[5];
    private Scanner scanner = new Scanner(System.in);

    public void verNumerosSistema() {

            System.out.printf("Los números generados son: %d, %d, %d, %d, %d%n",
                    numerosSistema[0], numerosSistema[1], numerosSistema[2], numerosSistema[3], numerosSistema[4]);

    }
    public void generarNumerosSistema2() {
        int contador = 0;
        int temporal = 0;

        do {
           temporal = (int) (Math.random() * 20) + 1;
           boolean repetido = false;
            for (int i = 0; i < numerosSistema.length; i++) {
                if (temporal == numerosSistema[i]){
                    repetido = true;
                    break;
                }
            }
            if (!repetido){
                numerosSistema[contador] = temporal;
                contador++; // cuantas veces has metido un numero valido, cuando llega a 5 para
            }

        }while(contador<5);

    }
    public void pedirNumerosUsuario() {
        for (int i = 0; i < numerosUsuario.length; i++) {
            int numero;
            do {
                System.out.printf("Introduce un valor: ");
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
        for (int i = 0; i < numerosSistema.length; i++) {
            for (int j = 0; j < numerosUsuario.length; j++) {
                if (numerosSistema[i] == numerosUsuario[j]){
                    aciertos++;
                    break;
                }
            }
        }
        System.out.println("El número de aciertos es: "+aciertos);

    }

}

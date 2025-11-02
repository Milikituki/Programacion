import java.util.Scanner;

public class Repeticion {
    public void EstructuraFOR(){
        for (int i=0; i<5; i++){
            System.out.println("Linea en ejecución "+i);
        }
        System.out.println("Saliendo");
    }
    public void ContadorPares(){
        Scanner scanner = new Scanner(System.in);
        int contadorPares=0, contadorImpares=0;
        int sumatorio =0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número en posición "+i+" : ");
            int numero = scanner.nextInt();

            if (numero%2==0){
                contadorPares++;
            } else {
                contadorImpares++;
            }
            sumatorio +=numero;
        }
        System.out.print("El número de pares es: "+contadorPares);
        System.out.print("\nEl número de impares es: "+contadorImpares);
        System.out.print("\nEl número medio introducido es: "+sumatorio/5);
    }
    public void TablaMultiplicar(){
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", 5, i, 5*i);
        }
    }
}

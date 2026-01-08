import controller.CampeonatoController;
import controller.CarreraController;
import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCoches;
        do {
            System.out.print("Introduce el número de coches (minimo 2): ");
            numCoches = scanner.nextInt();
        }while(numCoches<2);

        Coche[] coches = new Coche[numCoches];
        for (int i = 0; i < numCoches; i++) {
            coches[i] = new Coche("Piloto " + (i+1));
        }
        int numCarreras;
        do {
            System.out.print("Introduce el número de carreras (minimo 1): ");
            numCarreras = scanner.nextInt();
        }while(numCarreras<1);

        Campeonato campeonato = new Campeonato(coches);
        CampeonatoController campeonatoController = new CampeonatoController(campeonato);

        int[] km = new int[numCarreras];
        for (int i = 0; i < numCarreras; i++) {
            do {
                System.out.printf("%nIntroduce los kilómetros de la carrera %d: ", i+1);
                km[i] = scanner.nextInt();
            }while (km[i]<=0);
            Carrera carrera = new Carrera(coches, km[i]);
            CarreraController carreraController = new CarreraController(carrera);
            Coche[] clasificado = carreraController.correr();

            System.out.printf("%n --- CARRERA %d --- %n", i+1);
            for (int j = 0; j < clasificado.length; j++) {
                System.out.printf("%dº %s - %d Km - %d pts%n", j+1, clasificado[j].getNombre(), clasificado[j].getKm(), clasificado[j].getPuntos());

            }
            campeonatoController.resetearKms(clasificado);

        }
        System.out.println("\n --- CLASIFICACION FINAL --- ");
        campeonatoController.clasificar();


    }
}

package controller;
import model.*;

public class CampeonatoController {
    private Campeonato campeonato;
    public CampeonatoController(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
    public void resetearKms(Coche[] coches){
        for (int i = 0; i < coches.length; i++) {
            coches[i].setKm(0);
        }
    }
    public void ordenarPuntos(){
        Coche[] coches = campeonato.getCoches();
        for (int i = 0; i < coches.length; i++) {
            for (int j = 0; j < coches.length; j++) {
                if (coches[j].getPuntos() < coches[i].getPuntos()) {
                    Coche temporal = coches[i];
                    coches[i] = coches[j];
                    coches[j] = temporal;
                }
            }
        }
    }
    public void clasificar(){
        ordenarPuntos();
        for (int i = 0; i < campeonato.getCoches().length; i++) {
            Coche coche = campeonato.getCoches()[i];
            System.out.printf("%dº: %s - %d puntos%n", i+1, coche.getNombre(), coche.getPuntos());
        }
    }
}

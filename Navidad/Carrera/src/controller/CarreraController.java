package controller;

import model.Carrera;
import model.Coche;

public class CarreraController {
    private Carrera carrera;

    public CarreraController(Carrera carrera){
        this.carrera = carrera;
    }

    public Coche[] correr(){
        carrera.correr();
        ordenarKm(carrera.getCoches());
        puntuar(carrera.getCoches());
        return carrera.getCoches();
    }
    public void ordenarKm(Coche[] coches){
        for (int i = 0; i < coches.length; i++) {
            for (int j = 0; j < coches.length; j++) {
                if (coches[j].getKm() > coches[i].getKm() || (coches[i].getKm() == coches[j].getKm() && coches[i].getPuntos() < coches[j].getPuntos())) {
                    Coche temporal = coches[i];
                    coches[i] = coches[j];
                    coches[j] = temporal;
                }
            }
        }
    }
    public void puntuar(Coche[] coches){
        if (coches.length > 0){
            coches[0].sumaPuntos(10);
        }
        if (coches.length > 1){
            coches[1].sumaPuntos(8);
        }
        if (coches.length > 2){
            coches[2].sumaPuntos(6);
        }

    }
}

package model;

import controller.CarreraController;

public class Carrera {
    private Coche[] coches;
    private int distanciaCarrera;
    public Carrera(Coche[] coches, int distanciaCarrera){
        this.coches = coches;
        this.distanciaCarrera = distanciaCarrera;
    }
    Coche coche = null;
    public void correr(){
        boolean fin = false;
        for (int i = 0; i < coches.length; i++) {
            coche.setKm(0);
        }
        while (!fin){
            for (int i = 0; i < coches.length; i++) {
                coches[i].acelerar();
                if (coches[i].getKm() >= distanciaCarrera){
                    fin = true;
                }
            }
        }
        CarreraController carreraController = new CarreraController(this);
        carreraController.ordenarKm(coches);
        carreraController.puntuar(coches);
    }
    public Coche[] getCoches() {
        return coches;
    }

}

package model;

public class Carrera {
    private Coche[] coches;
    private int distanciaCarrera;
    public Carrera(Coche[] coches, int distanciaCarrera){
        this.coches = coches;
        this.distanciaCarrera = distanciaCarrera;
    }
    public void correr(){
        boolean fin = false;
        int ganador = -1;

        while(!fin){
            for (int i = 0; i < coches.length; i++) {
                coches[i].acelerar();
                if (coches[i].getKm() >= distanciaCarrera){
                    coches[i].setKm(distanciaCarrera);
                    ganador = i;
                    fin = true;
                }
            }
        }
    }
    public Coche[] getCoches() {
        return coches;
    }

}

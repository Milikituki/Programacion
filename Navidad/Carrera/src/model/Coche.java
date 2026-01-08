package model;

public class Coche {
    private String nombre;
    private int km;
    private int puntos;

    public Coche(String nombre){
        this.nombre = nombre;
        this.km = 0;
        this.puntos = 0;
    }
    public void acelerar(){
        int recorrido = (int)(Math.random()*31)+20;
        this.km += recorrido;
    }

    public void sumaPuntos(int punto){
        puntos += punto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    public int getPuntos() {
        return puntos;
    }
}

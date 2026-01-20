package model.e2;

public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche() {
    }

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}

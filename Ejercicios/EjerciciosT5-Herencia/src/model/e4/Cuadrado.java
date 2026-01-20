package model.e4;

public class Cuadrado extends Figura{
    private int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    public void calcularArea(){
        System.out.println("El area del cuadrado es "+lado*lado);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}

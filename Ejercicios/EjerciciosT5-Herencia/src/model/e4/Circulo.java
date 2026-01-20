package model.e4;

public class Circulo extends Figura{
    private int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }
    public Circulo(){}
    public void calcularArea(){
        System.out.printf("El area del circulo es %.1f", Math.PI*radio*radio);
    }

}

package Model;

public class Rectangulo {
    int base, altura;
    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int calcularArea(Rectangulo rectangulo){
        return getBase()*getAltura();
    }
    public int perimetro(Rectangulo rectangulo){
        return (getBase()+getAltura())*2;
    }
}

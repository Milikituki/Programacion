package model.e1;

public class Animal {
    private String nombre, sonido;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal() {
    }
    public Animal(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    public void hacerSonido(){
        System.out.println("Soy un animal");
    }
}

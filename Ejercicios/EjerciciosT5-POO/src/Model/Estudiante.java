package Model;

public class Estudiante {
    private String nombre;
    private int edad, nota;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >=0 && nota <=10) {
            this.nota = nota;
        } else  {
            System.out.println("\nLa nota debe estar entre 0 y 10");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

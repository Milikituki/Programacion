package model.e3;

public class Estudiante extends Persona{
    private int curso;
    public Estudiante(int curso){
        this.curso = curso;
    }

    public Estudiante(String nombre, int edad, int curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    public Estudiante() {
    }

    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public void estudiar(){
        System.out.println("Estoy estudiando "+curso+" de DAW");
    }
}

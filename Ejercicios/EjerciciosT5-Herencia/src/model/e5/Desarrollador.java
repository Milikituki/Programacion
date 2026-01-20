package model.e5;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;

    public Desarrollador() {
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public Desarrollador(String nombre, double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Puesto: "+getClass().getSimpleName());
        System.out.println("Salario Base: "+getSalarioBase());
        System.out.println("Lenguaje principal: "+lenguajePrincipal);
    }
}

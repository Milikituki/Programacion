package Model;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre, puesto;
    private double salario;

    public Empleado() {
    }
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarDatos(ArrayList<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println("Nombre: "+empleados.get(i).getNombre());
            System.out.println("Puesto: "+empleados.get(i).getPuesto());
            System.out.println("Salario: "+empleados.get(i).getSalario());
        }
    }
    public void mayorSalario(ArrayList<Empleado> empleados){
        double salarioMax = empleados.getFirst().getSalario();
        String nombre = null;
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getSalario() > salarioMax) {
                salarioMax = empleados.get(i).getSalario();
                nombre = empleados.get(i).getNombre();
                System.out.printf("Empleado con mayor salario: %s (%.1f€)", nombre, salarioMax);
            }
        }
    }
    public void promedio(ArrayList<Empleado> empleados){
        double suma = 0;
        for (int i = 0; i < empleados.size(); i++) {
            suma += empleados.get(i).getSalario();
        }
        System.out.printf("Salario promedio: %.1f€", suma / empleados.size());
    }
}

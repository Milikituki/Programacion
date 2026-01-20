package model.e5;

public class Gerente extends Empleado {
    private double bonus;

    public Gerente() {
    }

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void calcularSalarioTotal(){
        System.out.println("Salario total: "+(getSalarioBase()+bonus));
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Puesto: "+getClass().getSimpleName());
        System.out.println("Salario Base: "+getSalarioBase());
        System.out.println("Bonus: "+bonus);
        calcularSalarioTotal();
    }
}

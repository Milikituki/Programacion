import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan ", 25);
        System.out.print("Datos iniciales: "+persona.getNombre() + persona.getEdad()+"\n");

        //E2
        persona.setNombre("Maria ");
        persona.setEdad(55);
        System.out.println("Datos modificados: "+persona.getNombre()+persona.getEdad()+"\n");

        //E3
        Rectangulo rectangulo = new Rectangulo(5,3);
        System.out.println("Area: "+rectangulo.calcularArea(rectangulo));
        System.out.println("Perimetro: "+rectangulo.perimetro(rectangulo));

        // E4
        Libro libro1 = new Libro();
        System.out.println(libro1.getAutor()+libro1.getTitulo()+libro1.getPaginas());
        Libro libro2 = new Libro(" Don Quijote ", "Miguel de Cervantes");
        System.out.println(libro2.getAutor()+libro2.getTitulo()+libro2.getPaginas());
        Libro libro3 = new Libro(" Cien años de soledad ", "Gabriel García Márquez", 471);
        System.out.println(libro3.getAutor()+libro3.getTitulo()+libro3.getPaginas());

        //E5
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Garcia", 1500);
        cuenta1.depositar(500);
        System.out.printf("%nTitular: %s%n Nuevo saldo: %.1f€", cuenta1.getTitular(), cuenta1.getSaldo());
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 800);
        cuenta2.retirar(200);
        System.out.printf("%nTitular: %s%n Nuevo saldo: %.1f€", cuenta2.getTitular(), cuenta2.getSaldo());
        CuentaBancaria cuenta3 =  new CuentaBancaria("Pedro Martin", 1200);
        cuenta3.depositar(300);
        System.out.printf("%nTitular: %s%n Nuevo saldo: %.1f€",  cuenta3.getTitular(), cuenta3.getSaldo());
        System.out.printf("""
                %nSaldos finales:
                %s: %.1f€
                %s: %.1f€
                %s: %.1f€""",
                cuenta1.getTitular(), cuenta1.getSaldo(),
                cuenta2.getTitular(), cuenta2.getSaldo(),
                cuenta3.getTitular(), cuenta3.getSaldo());

        //E6
        Estudiante e1 = new Estudiante("Miriam");
        e1.setNota(69);

        //E7
        Producto p1 = new Producto("Teclado", 22.5, 3);
        p1.toString();
        Producto p2 = new Producto("Raton", 3.58, 2);
        p2.toString();

        //E7.1
        Direccion direccion =  new Direccion("Calle Llebeig", "Pollença", 07470);
        Cliente cliente = new Cliente("Miriam", "myriam1869@gmail.com", direccion);
        cliente.mostrarDatos();

        //E8
        Empleado empleado1 = new Empleado("Maria", "Directora", 34500);
        Empleado empleado2 = new Empleado("Miriam", "CEO", 134500);
        Empleado empleado3 = new Empleado("Miguel", "Software developer", 64500);
        ArrayList<Empleado> empleados = new ArrayList<>(List.of(empleado1, empleado2, empleado3));
        System.out.println("Mostrando datos");
        empleado1.mostrarDatos(empleados);
        System.out.println();
        empleado1.mayorSalario(empleados);
        System.out.println();
        empleado1.promedio(empleados);

        //E9
        System.out.println();
        System.out.printf("""
                Sumar: %d
                Restar: %d
                Multiplicar: %d
                Dividir: %.2f
                Potencia: %d""", Calculadora.sumar(10,5), Calculadora.restar(10,5),
                Calculadora.multiplicar(10,5), (double) Calculadora.dividir(10,5), Calculadora.potencia(2,3));




    }
}

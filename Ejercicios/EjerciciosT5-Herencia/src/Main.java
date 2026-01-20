import model.e1.Gato;
import model.e1.Perro;
import model.e2.Coche;
import model.e2.Vehiculo;
import model.e3.Estudiante;
import model.e3.Persona;
import model.e4.Circulo;
import model.e4.Cuadrado;
import model.e5.Desarrollador;
import model.e5.Gerente;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.setNombre("Rex");
        perro.setEdad(5);
        System.out.printf("""
                Animal: %s, %d años
                Sonido:\s""",  perro.getNombre(), perro.getEdad());
        perro.hacerSonido();
        Gato gato = new Gato();
        gato.setNombre("Mishi");
        gato.setEdad(3);
        System.out.println();
        System.out.printf("""
                Animal: %s, %d años
                Sonido:\s""",  gato.getNombre(), gato.getEdad());
        gato.hacerSonido();
        System.out.println();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Ford", "Focus", 5);
        coche1.setNumPuertas(3);
        coche1.setMarca("Seat");
        coche1.setModelo("Ibiza");
        System.out.printf("""
                Vehiculo: %s %s
                Coche: %s %s, %d puertas
                Coche: %s %s, %d puertas
                """, vehiculo.getMarca(), vehiculo.getModelo(),
                coche1.getMarca(), coche1.getModelo(), coche1.getNumPuertas(),
                coche2.getMarca(), coche2.getModelo(), coche2.getNumPuertas());
        System.out.println();

        //E3
        Estudiante laura = new Estudiante("Laura", 20, 2);
        Estudiante carlos = new Estudiante("Carlos", 19, 1);
        laura.presentarse();
        laura.estudiar();
        carlos.presentarse();
        carlos.estudiar();
        System.out.println();

        //E4
        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        System.out.println();
        Cuadrado cuadrado = new Cuadrado(4);
        cuadrado.calcularArea();
        System.out.println();

        //E5
        Gerente gerente = new Gerente("Gerente", 20000, 2500);
        gerente.mostrarDatos();
        System.out.println();
        Desarrollador desarrollador = new Desarrollador("Desarrollador", 10000, "Java");
        desarrollador.mostrarDatos();
    }


}

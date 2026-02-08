import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main(String[] args) {
        //Crear funcion lambda con un numero y que devuelva su cuadrado
        Function<Integer, Integer> cuadrado = x -> x*x;
        Integer[] prueba = {1,2,3,4,5};
        Arrays.stream(prueba).forEach(n -> System.out.println("El cuadrado de " +n+ " es: "+ cuadrado.apply(n)));

        // Crear predicate para definir numeros pares y aplicarlo a lista con 20 numeros.
        Predicate<Integer> esPar = x -> x % 2 == 0;
        Integer[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Integer[] pares = Arrays.stream(lista).filter(esPar).toArray(Integer[]::new);
        System.out.println(Arrays.toString(pares));

        //Crear BiiFunction para sumar y luego tambien para restar multi y dividir
        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        System.out.println(suma.apply(1, 2));
        BiFunction<Integer, Integer, Integer> resta = (a, b) -> a - b;
        System.out.println(resta.apply(2, 1));
        BiFunction<Integer, Integer, Integer> multi = (a, b) -> (a*b);
        System.out.println(multi.apply(2, 2));
        BiFunction<Integer, Integer, Double> div = (a, b) -> (double) a / b;
        System.out.println(div.apply(5, 2));

        // BiPredicate con 2 String para ver si tienen la misma longitud
        BiPredicate<String, String> longitud = (a, b) -> a.length() == b.length();
        System.out.println(longitud.test("alvarito","babuino"));

        //BiConsumer con 1 nombre y 1 edad y saque la info formateada
        BiConsumer<String, Integer> info = (a, b) -> System.out.println(a + ", " + b+ " años.");
        info.accept("Miriam", 32);

        // Usar Function y metodo andThenn() para crear una cadena de operaciones
        Function<Integer, Integer> operacion1 = x -> (x+10);
        Function<Integer, String> operacion2 = x -> String.valueOf(x*2);
        Function<Integer, String> operacion3 = operacion1.andThen(operacion2);
        System.out.println(operacion3.apply(3));

        //Crea una clase producto con nombre y precio, luego hacer una BiFunction que reciba dos productos y devuelva el de mayor precio.
        Producto producto1 = new Producto("Cuaderno", 3);
        Producto producto2 = new Producto("Boligrafo", 2);
        Producto producto3 = new Producto("Grapadora", 4);
        Producto producto4 = new Producto("Archivador", 5);
        BiFunction<Producto, Producto, String> comparador = (p1, p2) -> p1.getPrecio() > p2.getPrecio() ? p1.getNombre() : p2.getNombre();
        System.out.println(comparador.apply(producto1, producto2));
        System.out.println(comparador.apply(producto4, producto3));

        //Crear varios Predicates para filtrar una lista de numeros usando and(), or() y negate()
        Integer[] numFiltrar = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Predicate<Integer> mayorQue = x -> x>50;
        Predicate<Integer> par = x -> x%2==0;
        Predicate<Integer> divisiblesTres = x -> x%3==0;
            //and es para que se cumplan ambas condiciones
            //or es para que se cumpla al menos una de las condiciones
            //negate es para invertir lo que dice el predicate
        Arrays.stream(numFiltrar).filter(mayorQue.and(par)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(numFiltrar).filter(mayorQue.or(divisiblesTres)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(numFiltrar).filter(mayorQue.negate()).forEach(System.out::println);

        // Implementar una BiFunction que reciba dos listas de int y devuelva una lista nueva con todos los elementos, sin duplicados y ordenada de menor a mayor
        Integer[] lista1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Integer[] lista2 = {10,2,13,4,50,6,71,85,9,10};
        BiFunction<Integer[], Integer[], Integer[]> coleccion = (a, b) -> Stream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray(Integer[]::new);
        Integer[] resultadoColeccion = coleccion.apply(lista1, lista2);
        System.out.println(Arrays.toString(resultadoColeccion));

        // Sistema de gestion calificaciones con:
            //BiFunction para calcular nota final (60 teoria, 40 practica)
            //BiPredicate para saber si alumno aprobado (nota>=5)
            //Function para convertir nota numerica en letras
            //BiConsumer para imprimir el informe completo
            //Predicate para filtrar alumnos aprobados de suspensos
            //Implementar clase Alumno (nombre, notaTeoria, notaPractica) y lista de alumnos para aplicar las funciones

        BiFunction<Double, Double, Double> calcularNotaFinal = (a, b) -> (a*0.6)+(b*0.4);
        BiPredicate<Double, Double> aprobado = (notaFinal, notaMinima) -> notaFinal >= notaMinima;
        Double notaMinima = 5.0;
        Function<Double, String> pasarALetra = nota -> {
          if (nota >= 9.0) return "A";
          else if (nota >= 7.0) return "B";
          else if (nota >= 5.0) return "C";
          else if (nota >= 3.0) return "D";
          else return "F";
        };
        BiConsumer<Alumno, Double> generarInforme = (alumno, notaFinal) -> {
          String letra = pasarALetra.apply(notaFinal);
          boolean estaAprobado = aprobado.test(notaFinal, notaMinima);
            System.out.printf("""
                    Alumno: %s
                    Nota teoría (60%%): %.2f
                    Nota practica (40%%): %.2f
                    Nota final: %.2f (%s)
                    Aprobado: %s
                    """, alumno.getNombre(), alumno.getNotaTeoria(), alumno.getNotaPractica(), notaFinal, letra, (estaAprobado ? "S" : "N"));
        };

        Predicate<Alumno> alumnoAprobado = alumno -> {
            double notaFinal = calcularNotaFinal.apply(alumno.getNotaTeoria(), alumno.getNotaPractica());
            return aprobado.test(notaFinal, notaMinima);
        };

        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana García", 8.5, 9.0),
                new Alumno("Luis Martínez", 4.0, 4.5),
                new Alumno("Pedro Sánchez", 9.0, 8.5),
                new Alumno("María López", 6.5, 7.0),
                new Alumno("Carlos Ruiz", 3.5, 4.0),
                new Alumno("Laura Fernández", 7.0, 6.5),
                new Alumno("Jorge Díaz", 5.0, 5.5),
                new Alumno("Elena Torres", 2.5, 3.0)
        );
        System.out.println("--- INFORME COMPLETO DE CALIFICACIONES ---");
        alumnos.forEach(alumno -> {
            double notaFinal = calcularNotaFinal.apply(alumno.getNotaTeoria(), alumno.getNotaPractica());
            generarInforme.accept(alumno, notaFinal);
        });
        System.out.println();
        System.out.println("--- ESTADÍSTICAS GENERALES ---");
        List<Alumno> aprobados = alumnos.stream().filter(alumnoAprobado).toList();
        List<Alumno> suspensos = alumnos.stream().filter(alumnoAprobado.negate()).toList();
        System.out.println("\nAlumnos aprobados: "+aprobados.size());
        aprobados.forEach(alumno -> {
            double notaFinal = calcularNotaFinal.apply(alumno.getNotaTeoria(), alumno.getNotaPractica());
            System.out.printf("%s - %.2f (%s)\n", alumno.getNombre(), notaFinal, pasarALetra.apply(notaFinal));
        });
        System.out.println("\nAlumnos suspensos: "+suspensos.size());
        suspensos.forEach(alumno -> {
            double notaFinal = calcularNotaFinal.apply(alumno.getNotaTeoria(),  alumno.getNotaPractica());
            System.out.printf("%s - %.2f (%s)\n", alumno.getNombre(), notaFinal, pasarALetra.apply(notaFinal));
        });






    }
}

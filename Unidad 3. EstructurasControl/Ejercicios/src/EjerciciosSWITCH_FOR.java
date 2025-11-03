import java.math.BigInteger;
import java.util.Scanner;

public class EjerciciosSWITCH_FOR {
    Scanner scanner = new Scanner(System.in);
    public void e1(){

        System.out.print("Introduce un número (1-7): ");
        int numero = scanner.nextInt();
        String diaSemana = "";
        switch (numero){
            case 1 -> {
                diaSemana="Lunes";
            }
            case 2 -> {
                diaSemana="Martes";
            }
            case 3 -> {
                diaSemana="Miércoles";
            }
            case 4 -> {
                diaSemana="Jueves";
            }
            case 5 -> {
                diaSemana="Viernes";
            }
            case 6 -> {
                diaSemana="Sábado";
            }
            case 7 -> {
                diaSemana="Domingo";
            }
            default -> {
                System.out.println("Número incorrecto. Por favor, seleccione un número dentro del rango (1-7)");
            }
        }
        System.out.print("El día "+numero+" es: "+diaSemana);
    }
    public void e2(){
        System.out.print("Introduce tu calificación (A-F): ");
        String calificacion = scanner.next().toUpperCase();
        String mensaje = null;
        switch (calificacion){
            case "A" -> {
                mensaje = "Excelente";
            }
            case "B" -> {
                mensaje = "Muy bien";
            }
            case "C" -> {
                mensaje = "Bien";
            }
            case "D" -> {
                mensaje = "Suficiente";
            }
            case "F" -> {
                mensaje = "Insuficiente";
            }
            default -> {
                System.out.println("Error: Introduce una calificación válida");
            }
        }
        System.out.print("Calificación "+calificacion+" : "+mensaje);
    }
    public void e3(){
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce la operación (+, -, *, /, %): ");
        String operacion = scanner.next();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        int resultado = 0;
        double resultadoDivision = 0;

        switch (operacion){
            case "+"->{
                resultado = num1+num2;
            }
            case "-"->{
                resultado = num1-num2;
            }
            case "*"->{
                resultado = num1*num2;
            }
            case "/"->{
                resultadoDivision = (double) num1/num2;
            }
            default -> {
                System.out.println("Error: debes introducir números válidos");
            }
        }
        if (operacion.equals("/")){
            System.out.printf("Resultado: %.2f", resultadoDivision);
        } else {
            System.out.println("Resultado: "+resultado);
        }

    }
    public void e4(){
        System.out.println("-----Menú-----");
        System.out.println("1.- Ver perfil");
        System.out.println("2.- Configuración");
        System.out.println("3.- Ayuda");
        System.out.println("4.- Salir");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1->{
                System.out.println("Has seleccionado: Ver perfil");
            }
            case 2->{
                System.out.println("Has seleccionado: Configuración");
            }
            case 3->{
                System.out.println("Has seleccionado: Ayuda");
            }
            case 4->{
                System.out.println("Has seleccionado: Salir");
            }
            default -> {
                System.out.println("Error: Selecciona una opción válida (1-4)");
            }
        }
    }
    public void e5(){
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();
        String estacion = null;
        switch (mes){
            case 1, 2, 12:
                estacion = "Inverno";
                break;
            case 3, 4, 5:
                estacion = "Primavera";
                break;
            case 6, 7, 8:
                estacion = "Verano";
                break;
            case 9, 10 ,11:
                estacion = "Otoño";
                break;
            default:
                System.out.println("Error: Selecciona un número de mes válido (1-12)");
        }
        System.out.printf("El mes %d corresponde a: %s", mes, estacion);
    }
    public void e6(){
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        System.out.println("Tabla del "+num+":");

        for (int i = 1; i <11 ; i++) {
            System.out.print(num+" x "+i+" = "+num*i+"\n");

        }
    }
    public void e7(){
        System.out.printf("Introduce un número: ");
        int num = scanner.nextInt();
        int i = 0;
        int total = 0;

        System.out.printf("Sumando: ");
        for (i = 1; i < num+1; i++) {
            System.out.printf("%d ",i);
            if (i<num){
                System.out.printf("+ ");
            }
            total += i;
        }
        System.out.printf("%nSuma de los números del 1 al %d es: %d", num, total);
    }
    public void e8(){
        System.out.printf("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.printf("Recorriendo números del 1 al %d...", numero);
        int pares = 0;
        int impares = 0;
        for (int i = 1; i <= numero ; i++) {
            if (i%2==0){
                 pares += 1;
            } else {
                 impares += 1;
            }
        }
        System.out.printf("""
                %nNúmeros pares encontrados: %d
                Números impares encontrados: %d
                """, pares, impares);
    }
    public void e9(){
        System.out.printf("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.printf("Calculado %d! %n", numero);
        int i = 1;
        //Hay que usar BI porque los factoriales>20 necesitan una clase para alojar tantos números
        //si no, basta long
        BigInteger factorial = BigInteger.valueOf(1);
        //BI es una clase y no se puede proporcionar un entero,
        //hay que convertirlo a BI con un parseo
        for (i = numero; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            //en una clase no se puede usar operadores aritmeticos, hay que usar metodos
            //como i es un int hay que convertirlo a BI temporalmente para poder operar con él
            System.out.print(i);
            if (i > 1){
                System.out.print(" x ");
            }
        }
        System.out.printf("%nEl factorial de %d es: %d", numero,factorial);
    }
    public void e10(){
        System.out.printf("""
                
                --- EJERCICIOS ---
                1. Flexiones
                2. Abdominales
                3. Sentadillas 
                """);
        System.out.printf("Elije un ejercicio (1-3): ");
        int opcion = scanner.nextInt();
        System.out.printf("¿Cuántas repeticiones?: ");
        int repeticiones = scanner.nextInt();
        String ejercicio = null;
        switch (opcion){
            case 1 -> {
                ejercicio = "Flexiones";
            }
            case 2 -> {
                ejercicio = "Abdominales";
            }
            case 3 -> {
                ejercicio = "Sentadillas";
            }
        }
        System.out.printf("Has elegido: %s", ejercicio);
        for (int i = 1; i <= repeticiones; i++) {
            System.out.printf("%nRepetición %d completada", i);
            if (i==repeticiones){
                System.out.printf("%n¡Ejercicio completado! Has hecho %d %s.", repeticiones, ejercicio.toLowerCase());
            }
        }
    }

}
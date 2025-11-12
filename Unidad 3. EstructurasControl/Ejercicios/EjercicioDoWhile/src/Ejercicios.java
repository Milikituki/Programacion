import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);

    public void e1(){
/*        Crea un programa que pida un número N y use un bucle while para contar desde 1 hasta N, mostrando cada número.*/
        System.out.printf("Introduce un número: ");
        int numero = scanner.nextInt();
        int bucle = 0;
        while (bucle<numero){
            bucle++;
            System.out.println(bucle);
        }
        System.out.printf("Fin del conteo");
    }
    public void e2(){
        /*Desarrolla un programa que pida al usuario una contraseña.
        La contraseña correcta es "1234". Usa un bucle do-while para seguir
        pidiendo la contraseña hasta que el usuario la introduzca correctamente.*/

        String contrasenia = "";
        String contraseniaCorrecta = "1234";

        do {
            System.out.printf("Introduce la contraseña: ");
            contrasenia = scanner.nextLine();
            if (contrasenia.equals(contraseniaCorrecta)){
                System.out.println("Contraseña correcta, acceso permitido");
            } else {
                System.out.println("Contraseña incorrecta, intenta de nuevo");
            }
        } while (!contrasenia.equals(contraseniaCorrecta));

    }
    public void e3(){
        /*Escribe un programa que pida números al usuario y los vaya sumando.
        El bucle while debe continuar mientras el usuario introduzca números positivos.
        Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar la suma total.*/

        int numero, suma = 0;
        do {
            System.out.printf("Introduce un número: ");
            numero = scanner.nextInt();
            suma += numero;
            System.out.println("Suma actual: "+suma);
            if (numero <= 0){
                System.out.println("Programa terminado. Suma total: "+suma);
            }
        } while (numero > 0);
    }
    public void e4(){
        /*Crea un juego donde el programa elige un número secreto entre 1 y 10
        (por ejemplo, 7). Usa un bucle do-while para pedir al usuario que adivine el número.
        El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.*/

        int numero, contador = 0;
        int numeroSecreto = 3;
        System.out.printf("¡Adivina el número entre 1 y 10!%n");
        do {
            System.out.printf("Introduce tu intento: ");
            numero = scanner.nextInt();
            contador++;
            if (numero<numeroSecreto){
                System.out.println("El número es mayor. Intenta de nuevo");
            } else if (numero > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en "+contador+" intentos.");
            }
        }while (numero!=numeroSecreto);
    }
    public void e5(){
        /*Desarrolla un programa con un menú que se repita usando do-while.
        El menú debe tener 4 opciones: 1=Saludar, 2=Despedirse, 3=Ver hora actual
        (puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada opción.
        El programa solo debe terminar cuando el usuario elija la opción 4.*/
        int opcion = 0;
        do {
            System.out.printf("""
                   --- MENU ---
                   1. Saludar
                   2. Despedirse
                   3. Ver hora actual
                   4. Salir
                   """);
            System.out.printf("Elige una opción: %n");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("¡Hola, caracola!\n");
                }case 2 -> {
                    System.out.println("¡Adiós con el corazón!\n");
                }case 3 -> {
                    System.out.println("¡Son las carne y hueso!\n");
                }case 4 -> {
                    System.out.println("Saliendo...\n");
                }
            }
        } while (opcion!=4);

    }
    public void e6(){
        /*Escribe un programa que pida un número N y use un bucle while
         para hacer una cuenta atrás desde N hasta 1, mostrando cada número.
          Al llegar a 1, debe mostrar "¡Despegue!".*/
        int numero = 0;
        System.out.printf("Introduce un número: ");
        numero = scanner.nextInt();
        System.out.println(numero);
        while (numero>1){
            numero--;
            System.out.println(numero);
            if (numero==1){
                System.out.println("¡Despegue!");
            }

        }
    }
    public void e7(){
        /*Crea un programa que pida al usuario cuántas calificaciones
         va a introducir. Luego, usa un bucle while para pedir cada
         calificación una por una, sumarlas y al final calcular y mostrar el promedio.*/

        int numeroCalificaciones, repeticion = 0;
        double total = 0, calificacion = 0;
        System.out.printf("¿Cuántas calificaciones vas a introducir? ");
        numeroCalificaciones = scanner.nextInt();
        do {
            System.out.printf("Introduce tu calificación: ");
            calificacion = scanner.nextDouble();
            repeticion++;
            total += calificacion;
            if (repeticion==numeroCalificaciones){
                System.out.printf("Suma total: %.1f%n", total);
                System.out.printf("Promedio de calificaciones: %.2f", total/numeroCalificaciones);
            }
        }while(repeticion<numeroCalificaciones);
    }
    public void e8(){
/*        Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que la edad introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla. Una vez válida, muestra un mensaje de confirmación.*/

        int edad = 0;
        do {
            System.out.printf("Introduce tu edad: ");
            edad = scanner.nextInt();
            if (edad > 0 && edad < 120){
                System.out.println("Edad válida: "+edad+" años. ¡Gracias!");
            } else {
                System.out.println("Edad no válida, debe estar entre 0 y 120");
            }
        }while (edad < 0 || edad > 120);

    }
    public void e9(){
/*        Crea un programa que pida al usuario cuántos estudiantes hay en una clase. Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10). Luego, usa un bucle for para mostrar todas las calificaciones y usa un switch para convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.*/

        int numeroEstudiantes = 0;

        System.out.printf("¿Cuántos estudiantes hay? ");
        numeroEstudiantes = scanner.nextInt();
        int notaEstudiante = 0;
        int repeticion = 0;
        String calificacion = "";
        do {
            System.out.printf("Introduce la nota del estudiante: ");
            notaEstudiante = scanner.nextInt();
            repeticion++;


        } while (repeticion<numeroEstudiantes);
        for (int i = 1; i < repeticion; i++) {
            switch (notaEstudiante){
                case 10, 9->{
                    calificacion = "A";
                } case 8, 7->{
                    calificacion = "B";
                } case 6, 5->{
                    calificacion = "C";
                } case 4, 3->{
                    calificacion = "D";
                } case 2, 0->{
                    calificacion = "F";
                }
            }

        }
        System.out.printf("""
                        Estudiante %d: %d puntos = Calificación %s
                        """, repeticion, notaEstudiante, calificacion);

    }
}

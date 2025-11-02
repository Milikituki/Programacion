import java.util.Scanner;

public class Decisiones {
//ESTO SON ESTRUCTURAS DE SELECCION
    public void estructuraIF(int nota){
        System.out.println("Vamos a explicar la estructura IF");
        if(nota>=5){
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("La evaluación ha terminado");


    }
    public void estructuraIFELSEIF(double nota){
        //0 -> desastroso
        // 1-3.99 -> mal
        // 4-4.99 -> raspado
        // 5-7.99 --> bien
        // 8-8.99 -> notable
        // 9-9.99 -> sobresaliente
        // 10 -> MH
        System.out.println("Iniciando la evaluación del examen");
        if (nota>=0 && nota<=10){
            if (nota < 1){
                System.out.println("Examen desastroso");
            } else if (nota < 4){
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen suspenso raspado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("Examen de MH");
            }
        } else {
            System.out.println("Rango incorrecto");
        }

        System.out.println("Terminada la evaluación del examen");
    }
    public void estructuraSwitchTradicional(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        int nota = scanner.nextInt();

        //Si la nota es >5 // Si la nota es <7
        switch (nota){
            case 1:
                System.out.println("Has suspendido con honores");
                break;
            case 5:
                System.out.println("Has aprobado por los pelos");
                break;
            case 8:
                System.out.println("Has aprobado con nota");
                break;
            case 10:
                System.out.println("Lo has cuadrado!");
                break;
            default:
                System.out.println("La nota no es analizable");
        }
    }
    public void estructuraSwitchLambda(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = scanner.next();
        String apellido = "";
        switch (nombre){
            case "Borja" ->{
                System.out.println("Nombre introducido: Borja");
                apellido = "Fdez";
            }
            case "Maria" ->{
                System.out.println("Nombre introducido: Maria");
                apellido = "Rguez";
            }
            case "Juan" ->{
                System.out.println("Nombre introducido: Juan");
                apellido = "Diaz";
            }
            case "Marcos" ->{
                System.out.println("Nombre introducido: Marcos");
                apellido = "Dguez";
            }
            default -> {
                System.out.println("Caso no contemplado");
            }
        }
        System.out.println(apellido);
    }
    public void estructuraChar(char letra){
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es consonante");
        }
    }
    public void menuOpciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Menú-----");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Módulo");
        System.out.println("6.- Salir");
        System.out.print("Indica qué quieres hacer: ");
        int opcion = scanner.nextInt();
        int num1=0, num2=0;
        if (opcion>=1 && opcion<6){
            System.out.print("Introduce un número: ");
            num1 = scanner.nextInt();
            System.out.print("Introduce otro número: ");
            num2 = scanner.nextInt();
        }
        double total = 0;
        switch (opcion){
            case 1->{
                total = num1+num2;
                System.out.println("Total: "+total);
            }
            case 2->{
                total = num1-num2;
                System.out.println("Total: "+total);
            }
            case 3->{
                total = num1*num2;
                System.out.println("Total: "+total);
            }
            case 4->{
                total = (double)num1/num2;
                System.out.println("Total: "+total);
            }
            case 5->{
                if (num2!=0){
                    total = num1%num2;
                    System.out.println("Total: "+total);
                }
            }
            case 6->{
                System.out.println("Saliendo...");
            }
            case 7->{
                System.out.println("Opción no contemplada");
            }
        }
    }
}

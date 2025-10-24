import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos(){
        System.out.println("Explicación de los operadores aritméticos");
        int op1 = 5;
        op1++; // 5+1 = 6
        System.out.println("Incrementando: "+op1);
        op1--; //6-1 = 5
        op1--; //5-1 = 4
        System.out.println("Decrementando: " +op1);

        int op2 = 5;
        int suma = op1 + op2;
        System.out.println("El resultado de la suma es: "+suma);
        int resta = op1 - op2;
        System.out.println("El resultado de la resta es: "+resta);
        int multiplicacion = op1 * op2;
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        double division =  (double)op1 / op2;
        System.out.println("El resultado de la division es: "+division);
        int modulo = op1 % op2; //el resto de la division
        System.out.println("El resultado del modulo es: "+modulo);
    }
    public void operadoresAsignacion(){
        int op1 = 6;
        op1 += 10;
        System.out.println("\n"+"Sumo y asigno: "+op1);
        op1 -= 10;
        System.out.println("Resto y asigno: "+op1);
        op1 *=10;
        System.out.println("Multiplico y asigno: "+op1);
        op1 /= 10;
        System.out.println("Divido y asigno: "+op1);
        op1 %=10;
        System.out.println("Modúlo y asigno: "+op1);
    }
    public void operadoresComparacion(){
        int num1 = 4;
        int num2 = 7;
        boolean resultado = num1>num2;
        System.out.println("\n"+"4 es mayor que 7: "+resultado);
        resultado = num1>=num2;
        System.out.println("4 es mayor o igual que 7: "+resultado);
        resultado = num1<num2;
        System.out.println("4 es menor que 7: "+resultado);
        resultado = num1<=num2;
        System.out.println("4 es menor o igual que 7: "+resultado);
        resultado = num1==num2;
        System.out.println("4 es igual que 7: "+resultado);
        resultado = num1!=num2;
        System.out.println("4 es diferente de 7: "+resultado);
    }
    public void operadoresLogicos(){
        int num1 = 4;
        int num2 = 10;
        int num3 = 17;

        boolean rLogicoAND = num1>1 && num2<11 && num2!=num3;
        System.out.println("\n"+"El resultado lógico de 4>1 && 10<11 && 10!=17 es: "+rLogicoAND);
        boolean rLogicoOR = num1!=10 || num2>10 || num3<num2 || num2%2!=0;
        System.out.println("El resultado lógico de 4!=10 || 10>10 || 17<10 || 10%2!=0 es: "+rLogicoOR);
    }
    public void evaluarCandidato(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = scanner.nextLine();
        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();
        System.out.println("Tienes experiencia");
        boolean experiencia = scanner.nextBoolean();
        System.out.println("Qué salario quieres cobrar");
        double salario = scanner.nextDouble();
        boolean requisitos = edad<40 && salario<4000 && experiencia;
        System.out.println("El resultado de tu evaluación es: "+requisitos);
        scanner.close(); //buena práctica
    }
    public void cambiosTipo(){
        int letraASCII = 75;
        System.out.println((char)letraASCII);
        char letra1 = 'w';
        System.out.println((int)letra1);

        //String palabra = "hola";
        //System.out.println(Integer.parseInt(palabra));
        //da fallo, pero si hubiese un número "7", sí funcionaría, porque entiende que es un número

        //String palabra = "false";
        //System.out.println(Boolean.parseBoolean(palabra));
        // aquí si pones algo que no sea "true" te sale false, porque no lo puede cambiar

        int numero = 123;
        System.out.println(String.valueOf(123)+1);
        char letra2 = 'a';
        System.out.println(String.valueOf(letra2));
    }

}

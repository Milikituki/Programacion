public class Ejercicio6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println("Número 1: "+num1);
        System.out.println("Número 2: "+num2);
        sumar(num1, num2);
        restar(num1, num2);
        multiplicar(num1, num2);
        dividir(num1, num2);

    }

    public static void sumar(int op1, int op2){
        int resultadoS = op1 + op2;
        System.out.println("Suma: "+resultadoS);
    }
    public static void restar(int op1, int op2){
        int resultadoR = op1 - op2;
        System.out.println("Resta: "+resultadoR);
    }
    public static void multiplicar(int op1, int op2){
        int resultadoM = op1 * op2;
        System.out.println("Multiplicación: "+resultadoM);
    }
    public static void dividir(int op1, int op2){
        int resultadoD = op1 / op2;
        System.out.println("División: "+resultadoD);
    }
}

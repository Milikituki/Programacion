package Model;

public class Calculadora {
    private int operando1, operando2;

    public Calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
    public static int sumar(int operando1, int operando2){
        return operando1 + operando2;
    }
    public static int restar(int operando1, int operando2){
        return operando1 - operando2;
    }
    public static int multiplicar(int operando1, int operando2){
        return operando1 * operando2;
    }
    public static int dividir(int operando1, int operando2){
        return operando1 / operando2;
    }
    public static int potencia(int base, int exponente){
        return Math.powExact(base, exponente);
    }
}

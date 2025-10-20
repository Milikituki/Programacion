public class Ejercicio8 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Base del rectángulo: "+a);
        int b = 3;
        System.out.println("Altura del rectángulo: "+b);
        calcularArea(a,b);
    }
    public static void calcularArea(int a, int b){
        int area = a*b;
        System.out.println("El área del rectángulo es: "+area);
    }
}

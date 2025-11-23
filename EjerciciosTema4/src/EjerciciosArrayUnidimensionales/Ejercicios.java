package EjerciciosArrayUnidimensionales;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);
    public int[] generarNumerosIntArray(int largo, int cantidadRandom){
        int[] numero = new int[largo];
        for (int i = 0; i < numero.length; i++) {
            int numeroIndividual = (int) (Math.random()*cantidadRandom)+1;
            numero[i] = numeroIndividual;
        }
        System.out.printf("Array: %s%n", Arrays.toString(numero));
        return numero;
    }
    public double[] generarNumerosDoubleArray(int largo, int cantidadRandom){
        double[] numero = new double[largo];
        for (int i = 0; i < numero.length; i++) {
            double numeroIndividual = (Math.random()*cantidadRandom)+1;
            double redondear = Math.round(numeroIndividual * 100.0);
            double redondeoFinal = redondear/100;
            numero[i] = redondeoFinal;
        }
        System.out.printf("Array: %s%n", Arrays.toString(numero));
        return numero;
    }
    public void ejercicio1(){
        /*Crea un programa que defina un array llamado frutas con 5 nombres de frutas. Luego, muestra todos los elementos del array en la consola, uno por línea.*/

        String[] frutas = new String[]{"manzana", "plátano", "pera", "tomate", "piña"};
        for (String item : frutas) {
            System.out.println(item);

        }
    }
    public void ejercicio2(){
       /* Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer el array y mostrar cada número junto con su posición (índice).  */
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posición %d: %d%n", i, numeros[i]);

        }
    }
    public void ejercicio3(){
        /*Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario que introduzca 5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados. */
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Introduce el nombre %d: ", i+1);
            String nombre = ""; // creas una variable "individual" donde se va a guardar un nombre
            nombre = scanner.nextLine();
            nombres[i] = nombre; // dentro del array guardas cada nombre individual en la posicion que le toque
        }
        System.out.println("Nombres introducidos: ");
        for (String item : nombres) {
            System.out.println(item);
        }
    }
    public void ejercicio4(){
        /*Crea un programa con un array de 7 números. Pide al usuario un número a buscar y usa un bucle for para recorrer el array. Si el número existe, muestra su posición. Si no existe, indica que no se encontró.*/

        int[] numero = new int[7];
        for (int i = 0; i < numero.length; i++) {
            int numeroIndividual = (int) (Math.random()*25)+1;
            numero[i] = numeroIndividual;
        }
        System.out.printf("Array: %s%n", Arrays.toString(numero));
        System.out.print("Introduce el número que quieras buscar: ");
        int numeroBuscar = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i<numero.length; i++) {
            if (numeroBuscar == numero[i]){
                System.out.printf("El número %d se encuentra en la posición %d", numeroBuscar, i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.printf("El número %d no se encuentra en el array", numeroBuscar);

        }
    }
    public void ejercicio5(){
       /* Escribe un programa que defina un array de 10 números enteros. Usa un bucle for para contar cuántos números son mayores que 50 y muestra el resultado.*/
        int[] numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            int numeroIndividual = (int) (Math.random()*100)+1;
            numero[i] = numeroIndividual;
        }
        System.out.printf("Array: %s%n", Arrays.toString(numero));
        int numeroCorrecto = 50;
        int numerosEncontrados = 0;
        for (int j : numero) {
            if (j > numeroCorrecto) {
                numerosEncontrados++;
            }

        }
        System.out.printf("Cantidad de números mayores que %d: %d%n",numeroCorrecto, numerosEncontrados);
    }
    public void ejercicio6(double[] numeros){
        double suma = 0.0;
        double promedio = 0.0;
        for (double numero : numeros) {
            suma += numero;
        }
        promedio = suma/ numeros.length;
        System.out.printf("""
                Suma: %.2f
                Promedio: %.2f""", suma, promedio);
    }
    public void ejercicio7(int[] numeros){
       /* Desarrolla un programa que cree un array de 6 números. Usa bucles for para encontrar el número mayor y el número menor del array, y muestra ambos resultados.*/
        int maximo = numeros[0]; //asumo que el más grande es el primero y voy comparando
        int minimo = numeros[0]; // asumo que el más pequeño es el primero y voy comparando
        for (int numero : numeros) {
            if (maximo < numero) { // si el numeroMaximo es más pequeño que el número que haya en esa posición, entonces transformo el valor de "maximo" en el que haya en esa posición
                maximo = numero;
            }
        }
        for (int numero : numeros) {
            if (minimo > numero) {
                minimo = numero;
            }
        }
        System.out.printf("El numero máximo es: %d%n", maximo);
        System.out.printf("El numero mínimo es: %d", minimo);
    }
    public void ejercicio8(){
        String[] palabras = new String[]{"gato", "harina", "archivador", "teclado", "luces", "tapón", "bebé", "pala", "microondas", "instrumento"};
        System.out.print("Introduce la palabra que quieres buscar: ");
        String palabraUsuario = scanner.next();
        boolean coincidencia = false;
        int repeticion = 0;
        for (int i = 0; i < palabras.length; i++) {
            if (palabraUsuario.equals(palabras[i])){
                repeticion++;
                coincidencia = true;
            }
        }

        if (!coincidencia){
            System.out.printf("La palabra %s no aparece en el array", palabraUsuario);
        } else {
            System.out.printf("La palabra %s aparece %d veces en el array", palabraUsuario, repeticion);
        }

    }
    public void ejercicio9(int[] numeros){
        int opuesto = 0;
        int numeroIndividual = 0;
        for (int i = 0; i < numeros.length/2; i++) {
            opuesto = numeros.length -1 -i; // El último índice menos 1 (porque es la última posición) y menos i porque depende de la posición de i será la última o la penultima... por ejemplo: i = 2 (tercera posición) -> último índice (7) - 1 = 6 - 2 = 4 -> la tercera posición se cambia por la quinta (antepenultima) posición
            numeroIndividual = numeros[i]; //guarda el valor en cada vuelta
            numeros[i] = numeros[opuesto]; // aquí le indico que en la posición i vamos a meter la opuesta que hemos "calculado" en la variable "opuesto"
            numeros[opuesto] = numeroIndividual; // en la posición opuesta vamos a guardar el "original"
        }
        System.out.print("Array invertido: [");
        for (int numero : numeros) {
            System.out.printf("%d, ",numero);
        }
        System.out.print("]");

    }
    public void ejercicio10(){

    }


}

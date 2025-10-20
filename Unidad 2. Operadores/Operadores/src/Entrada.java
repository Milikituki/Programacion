public class Entrada {
    public static void main(String[] args) {
        Operadores opVariable = new Operadores();;
        //Con esto creamos una variable con las funciones importadas de la clase operadores,
        //que hemos creado en otra "javaClass"
        opVariable.operadoresAritmeticos();
        //aquí llamamos a la función que hemos creado,
        //diciéndole que la busque en la clase que hemos importado
        opVariable.operadoresAsignacion();
        opVariable.operadoresComparacion();
        opVariable.operadoresLogicos();
        opVariable.evaluarCandidato();
    }
}

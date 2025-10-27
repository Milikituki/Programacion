import java.util.Scanner;

public class Ejercicios {

    public void ejercicio1(){

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = s.nextInt();

        if (edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar");
        } else {
            System.out.println("Eres menor de edad. NO puedes votar");
        }

    }
    public void e2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = s.nextInt();

        if (numero == 0) {
            System.out.println("El número es 0");
        } else if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
    public void e3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        double nota = s.nextDouble();

        if (nota>=5){
            System.out.println("¡Enhorabuena! Has aprobado.");
        } else {
            System.out.println("¡Lástima! Has suspendido.");
        }
    }
    public void e4(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra: ");
        double compra = s.nextDouble();

        double descuento = compra-(compra*0.9);
        double subtotal = compra-descuento;

        if (compra>=100){
            System.out.printf("""
                    Importe original: %.1f
                    Descuento aplicado: %.1f€
                    Importe final: %.1f€
                    """, compra, descuento, subtotal);
        } else {
            System.out.println("Importe final: "+compra+"€");
        }
    }
    public void e6(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = s.nextInt();

        if (edad>=16){
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado. Debes tener al menos 16 años");
        }
    }
    public void e7(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        double nota = s.nextDouble();
        boolean suspenso = nota<5;
        boolean aprobado = nota<7;
        boolean notable = nota<9;
        boolean sobresaliente = nota<=10;
        boolean correcto = nota>0 && nota<10;

        if (correcto){
            if (suspenso){
                System.out.println("Tu calificación es: Suspenso");
            } else if (aprobado){
                System.out.println("Tu calificación es: Aprobado");
            } else if (notable){
                System.out.println("Tu calificación es: Notable");
            } else {
                System.out.println("Tu calificación es: Sobresaliente");
            }
        } else{
            System.out.println("Introduce una calificación válida (0-10)");
        }
    }
    public void e8(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = s.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = s.nextInt();

        boolean iguales = num1==num2;
        boolean mayor = num1>num2;

        if (iguales){
            System.out.printf("El número %d es igual que %d", num1, num2);
        } else if (mayor){
            System.out.printf("El número %d es mayor que %d", num1, num2);
        } else {
            System.out.printf("El número %d es menor que %d", num1, num2);
        }
    }
    public void e9(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu peso en kg: ");
        double peso = s.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        double altura = s.nextDouble();

        double IMC = peso/(altura*altura);
        boolean normal = IMC >= 18.5 && IMC <= 24.9;
        boolean bajo = IMC < 18.5;
        boolean alto = IMC > 24.9;

        if (bajo){
            System.out.printf("Tu IMC es: %.2f %nEstás por debajo del peso normal.",IMC);
        } else if (alto){
            System.out.printf("Tu IMC es: %.2f %nEstás por encima del peso normal.",IMC);
        } else {
            System.out.printf("Tu IMC es: %.2f %nEstás en peso normal.",IMC);
        }
    }
    public void e10(){
        Scanner s = new Scanner (System.in);
        System.out.println("Introduce tu altura en cm: ");
        int altura = s.nextInt();

        boolean bajo = altura<120;
        boolean alto = altura>200;

        if (bajo){
            System.out.println("No puedes subir a la atracción. Altura mínima: 120cm");
        }else if (alto){
            System.out.println("No puedes subir a la atracción. Altura máxima: 200cm");
        }else{
            System.out.println("Puedes subir a la atracción.");

        }
    }
    public void e11(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra: ");
        double compra = s.nextDouble();
        if (compra<0){
            System.out.println("Introduce un importe de compra válido");
            return; //con esto para el código y no sigue preguntando nada más
        }

        System.out.println("¿Eres socio?");
        boolean socio = s.nextBoolean();

        boolean descuento20 = compra>=200 && socio;
        boolean descuento10 = compra<200 && socio;
        boolean descuento5 = compra>=300 && !socio;

        double descuentoA20 = compra*0.8;
        double descuentoA10 = compra*0.9;
        double descuentoA5 = compra*0.95;


        if (descuento10){
            System.out.printf("""
                        Importe original: %.1f€
                        Eres socio y tu compra es <200€
                        Descuento aplicado: %.1f€
                        Importe final: %.1f€""",
                    compra, compra-descuentoA10, descuentoA10);
        }else if (descuento20){
            System.out.printf("""
                        Importe original: %.1f€
                        Eres socio y tu compra es >=200€
                        Descuento aplicado: %.1f€
                        Importe final: %.1f€""",
                    compra, compra-descuentoA20, descuentoA20);
        }else if (descuento5){
            System.out.printf("""
                        Importe original: %.1f€
                        No eres socio pero tu compra es >=300€
                        Descuento aplicado: %.1f€
                        Importe final: %.1f€""",
                    compra, compra-descuentoA5, descuentoA5);
        }else{
            System.out.printf("""
                        Importe original: %.1f€
                        No eres socio y tu compra es <300€
                        Descuento aplicado: 0€
                        Importe final: %.1f€""",
                    compra, compra);
        }

    }
    public void e12(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una contraseña:");
        String pswd = s.nextLine();

        int longitud = pswd.length();
        int minLong = 8;
        boolean caracteres = longitud>=minLong;

        boolean numerico = pswd.matches(".*\\d.*");
        boolean prohibida = pswd.equals("12345678") || pswd.equals("password");
        boolean requisitos = numerico && prohibida && caracteres;

        System.out.println("Longitud de la contraseña: "+longitud);
        System.out.printf("¿Tiene al menos %d carácteres? %b%n", minLong, caracteres);
        System.out.printf("¿Contiene al menos un número? %b%n", numerico);
        System.out.printf("¿Es una contraseña prohibida? %b%n", prohibida);
        System.out.printf("¿Cumple todos los requisitos? %b%n", requisitos);

        if (!caracteres) {
            System.out.printf("Contraseña NO válida. Debe tener al menos %d carácteres%n", minLong);
        }else if (prohibida){
            System.out.println("Contraseña NO válida. No debe ser '12345678' ni 'password'");
        } else if (!numerico){
            System.out.println("Contraseña NO válida. Debe tener al menos un número");
        } else {
            System.out.println("Contraseña válida");
        }



    }
    public void e13(){
        //entrada museo
        //pide edad y dia semana (1-7)
        // -12 -> entrada gratis
        // 12-17 -> 5€ y martes gratis
        // 18-64 -> 10 (7 los jueves)
        //+65 -> 6€

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = s.nextInt();
        System.out.print("Introduce el día de la semana (1-7): ");
        int dia = s.nextInt();
        int entrada;
        boolean ninio = edad<12;
        boolean joven = edad>=12 && edad<=17;
        boolean normal = edad>=18 && edad<=64;
        boolean mayor = edad>=65;
        String diaSemana = null;
        boolean esMartes = dia == 2;
        boolean esJueves = dia == 4;

        if (dia == 1){
            diaSemana = "Lunes";
        } else if (dia ==2){
            diaSemana = "Martes";
        } else if (dia == 3){
            diaSemana = "Miércoles";
        } else if (dia == 4){
            diaSemana = "Jueves";
        } else if (dia == 5){
            diaSemana = "Viernes";
        } else if (dia == 6){
            diaSemana = "Sábado";
        } else if (dia == 7){
            diaSemana = "Domingo";
        }else{
            System.out.println("Elija un día de la semana válido");
        }

        System.out.printf("""
                Edad: %d
                Día de la semana: %d (%s)
                ¿Eres menor de 12 años? %b
                ¿Tienes entre 12 y 17 años? %b
                ¿Tienes entre 18 y 64 años? %b
                ¿Tienes más de 65 años? %b
                """, edad, dia, diaSemana,
                ninio, joven, normal, mayor);

        if (ninio){
            entrada = 0;
        } else if (joven){
            System.out.printf("¿Es martes? %b%n", esMartes);
            if (dia == 2){entrada = 0;}else {entrada = 5;}
        }else if (normal){
            System.out.printf("¿Es jueves? %b%n", esJueves);
            if (dia == 4){entrada =7;}else {entrada = 10;}
        }else {
            entrada = 6;
        }

        System.out.printf("""
                Precio de la entrada: %d€""", entrada);


    }
    public void e14(){
        //prestamo bancario
        //pedor edad, ingresos mensuales y si tiene deudas pendientes
        //edad 21-65
        //ingresos +=1000
        //no tener deudas

        Scanner s = new Scanner (System.in);
        System.out.printf("Introduce tu edad: ");
        int edad = s.nextInt();
        System.out.printf("Introduce tus ingresos mensuales: ");
        int ingresos = s.nextInt();
        System.out.printf("¿Tienes deudas pendientes? (true/false): ");
        boolean deudas = s.nextBoolean();

        boolean edadViable = edad>=21 && edad<=65;
        boolean ingresosViables = ingresos>=1000;
        boolean elegible = edadViable && ingresosViables && !deudas;


        System.out.printf("""
                Edad entre 21 y 65? %b
                ¿Ingresos de al menos 1000€? %b
                ¿Sin deudas pendientes? %b
                ¿Es elegible para el préstamo? %b
                """, edadViable, ingresosViables, !deudas, elegible);

        if (elegible){
            System.out.println("¡Felicidades! Eres elegible para solicitar el préstamo.");
        } else {
            System.out.println("Lo sentimos, no cumples los siguientes requisitos para solicitar el préstamo: ");
            if (!edadViable){
                System.out.println("- La edad debe ser entre 21 y 65 años.");
            }
            if (!ingresosViables){
                System.out.println("- Los ingresos deben ser al menos 1000€.");
            }
            if (deudas) {
                System.out.println("- No debes tener deudas pendientes. ");
            }
        }

    }
    public void e15(){
        //pedir peso kg, distancia km y envio urgente (t/f)
        // precio base 5€
        // peso +5kg -> +2€/kg
        // distancia +100km -> 10€
        // urgente -> preciototal*1,5

        Scanner s = new Scanner (System.in);
        System.out.print("Introduce el peso del paquete (kg): ");
        double peso = s.nextDouble();
        System.out.print("Introduce la distancia del envío (km): ");
        double distancia = s.nextDouble();
        System.out.print("¿Es envío urgente? (true/false): ");
        boolean urgente = s.nextBoolean();

        double precioBase = 5.00;
        double pesoExtra = 2.00;
        double pesoBase= 5.00;
        double distanciaBase = 100.00;
        //double totalPesoExtra = 0;
        double diferenciaPeso =0;
        double precioPesoExtra = 0;
        //double precioUrgente = 0;
        double precioDistanciaExtra = 0;


        if (peso > pesoBase){
            diferenciaPeso = peso-pesoBase;
            precioPesoExtra = pesoExtra*diferenciaPeso;
            //totalPesoExtra = precioBase+precioPesoExtra;
        }
        if (distancia > distanciaBase){
            precioDistanciaExtra = 10;
        }
        double subtotal = precioBase+precioPesoExtra+precioDistanciaExtra;
        double precioUrgente;

        if (urgente){
            precioUrgente = subtotal*1.5;
        } else {
            precioUrgente = subtotal;
        }
        double recargoUrgente = precioUrgente-subtotal;

        System.out.printf("""
                Precio base: %.1f€
                Peso: %.1fkg (excede %.0fkg en %.1fkg)
                Coste adicional por peso: %.1f€
                Distancia: %.0fkm
                Coste adicional por distancia: %.1f€
                Subtotal: %.1f€
                ¿Es envío urgente? %b
                Recargo por urgencia (x1.5): %.1f€
                Coste total de envío: %.1f€
                """, precioBase, peso, pesoBase, diferenciaPeso,
                precioPesoExtra, distancia, precioDistanciaExtra,
                subtotal, urgente, recargoUrgente,precioUrgente);

    }

}

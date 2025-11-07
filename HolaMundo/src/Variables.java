public class Variables {
    public static void main(String[] args) {
        // Declaracion de variables
        int numero = 10;
        String nombre = "Camila";
        char letra = 'A';
        double temperatura = 36.5;
        Boolean SioNo = true;
        long poblaccion = 7800000000L;
        numero = 20; // reasignacion de valor a la variable numero
        // si no quiero reasignar el valor uso la palabra final, esto convierte a la
        // variable en un constante y por convencion van en mayusculas
        final double LONGITUD = 15.5;
        // LONGITUD = 20.5; // esto daria error porque es una variable
        // declarar multiples variables del mismo tipo
        int x = 5, y = 6, z = 7;
        System.out.println("La suma de x, y y z es: " + (x + y + z));
        // usar un valor para multiples varibles, primero declaro las variables y luego
        // asigno
        int a, b, c;
        a = b = c = 50;
        // numero cientifico
        double distancia = 1.5e3; // 1.5 por 10 a la 3
        float longitud = 20.5E4f; // 20.5 por 10 a la 4

        // conversion de tipo de datos
        int numeroEntero = 100;
        double numeroDecimal = numeroEntero; // conversion implicita de int a double
        double otroDecimal = 45.67;
        int otroEntero = (int) otroDecimal; // conversion explicita de double a int

        System.out.println("La distancia es: " + distancia);
        System.out.println("La suma de a, b y c es: " + (a + b + c));

        System.out.println("Numero: " + numero);
        System.out.println("Nombre: " + nombre);
        System.out.println("Letra: " + letra);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Booleano: " + SioNo);
        System.out.println("Poblacion mundial: " + poblaccion);
        System.out.println("Longitud: " + longitud);
        /*
         * Fin de la declaracion de variables
         * y de paso estoy probando hacer comentarios multinlinea
         */

    }

}

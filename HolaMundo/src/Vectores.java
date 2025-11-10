public class Vectores {
    public static void main(String[] args) {
        // declaro un vector e inicializo su tamaño
        int vector[] = new int[4];
        // asignacion de valores a cada posicion del vector
        vector[0] = 5;
        vector[1] = 10;
        vector[2] = 15;
        vector[3] = 20;
        // Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en la posicion/indice " + i + " y tengo guardado un " + vector[i]);
        }

        // ingresando valores por teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int vector2[] = new int[4];
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese un valor para la posicion " + i + ": ");
            vector2[i] = teclado.nextInt();
        }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Estoy en la posicion/indice " + i + " y tengo guardado un " + vector[i]);
        }
        // otra forma de declarar e inicializar un vector
        int vector3[] = { 2, 4, 6, 8, 10 };
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("Estoy en la posicion/indice " + i + " y tengo guardado un " + vector3[i]);
        }
        // modificar un valor
        vector3[2] = 20; // cambio el 6 por un 20
        System.out.println("En la posicion 2 ahora tengo un " + vector3[2]);

        // tabien se puede usar new para inicializar con valores pero sin mencionar el
        // tamaño
        int vector4[] = new int[] { 1, 3, 5, 7, 9 }; // menos comun
        for (int i = 0; i < vector4.length; i++) {
            System.out.println("Estoy en la posicion/indice " + i + " y tengo guardado un " + vector4[i]);
        }
    }
}

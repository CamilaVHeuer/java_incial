public class Matrices {
    public static void main(String[] args) {
        // declaracion e inicializacion
        int matriz[][] = new int[3][3];

        // asignacion manual
        matriz[0][0] = 5;
        matriz[0][1] = 10;
        matriz[0][2] = 15;
        matriz[1][0] = 20;
        matriz[1][1] = 25;
        matriz[1][2] = 30;
        matriz[2][0] = 35;
        matriz[2][1] = 40;
        matriz[2][2] = 45;
        // recorrido con bucles anidados
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out
                        .println("Estoy en la fila " + f + " y columna " + c + " y tengo guardado un " + matriz[f][c]);
            }
        }

        // para leer por teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int matriz2[][] = new int[2][2];
        // ingreso de valores
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Ingrese un valor para la fila " + f + " y columna " + c + ": ");
                matriz2[f][c] = teclado.nextInt();
            }

        }
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out
                        .println("Estoy en la fila " + f + " y columna " + c + " y tengo guardado un " + matriz2[f][c]);
            }
        }

        // otra forma de declarar e inicializar
        int matriz3[][] = { { 1, 8 }, { 7, 3 } };
        for (int f = 0; f < matriz3.length; f++) {
            for (int c = 0; c < matriz3[f].length; c++) {
                System.out
                        .println("Estoy en la fila " + f + " y columna " + c + " y tengo guardado un " + matriz3[f][c]);
            }
        }
    }
}

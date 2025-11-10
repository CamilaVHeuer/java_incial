
/* Realizar un programa que permita cargar 15 numeros en un vector por teclado.
Una vez cargados, se necesita que el programa cuente e informe cuantas veces se cargo el numero 3. */
import java.util.Scanner;

public class EjercicioVectores {
    public static void main(String[] args) {
        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);
        // Solicitud de numeros al usuario y carga
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero para la posicion " + i + ": ");
            vector[i] = teclado.nextInt();
        }
        // Conteo de veces que se ingreso el numero 3
        int contador3 = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 3) {
                contador3++;
            }

        }
        System.out.println("La cantidad de veces que apareció el numero 3 es: " + contador3);

    }

}

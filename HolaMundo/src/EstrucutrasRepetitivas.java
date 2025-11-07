import java.util.Scanner;

public class EstrucutrasRepetitivas {
    public static void main(String[] args) {
        // Ejemplo de bucle while
        int i = 0; // declaro la variable
        while (i < 5) {
            System.out.println("Valor de i: " + i);
            i++; // no olvidar aumentar la variable para evitar bucle infinito
        }

        // Ejemplo de bucle do-while: me aseguro que se ejecuta al menos una vez, porque
        // ya se que la condicion es falsa
        int k = 10;
        do {
            System.out.println("Valor de k: " + k);
            k++;
        } while (k < 5);

        // Ejemplo usando while + if-else
        int dado = 0;
        // este es un bucle controlado por contador
        while (dado <= 6) {
            if (dado < 6) {
                System.out.println("No sacaste un 6. Volvé a ingresar un valor");
            } else {
                System.out.println("¡Felicidades! Has sacado un 6.");
                break; // salir del bucle
            }
            dado++;
        }
        // Ejemplo usando for
        for (int j = 0; j < 5; j++) {
            System.out.println("Valor de j: " + j);
        }
        // la primera instruccion es la declaracion de la variable y asignacion inicial
        // antes de que comience el bucle
        // la segunda instruccion es la condicion que se evalua antes de cada iteracion
        // del bucle
        // la tercera instruccion es la actualizacion de la variable que se ejecuta al
        // final de cada iteracion del bucle.
        int h;
        for (h = 0; h < 3; h++) {
            System.out.println("Valor de h: " + h);

        }
        // imprimir numeros pares del 0 al 10
        int numero;
        for (numero = 0; numero < 10; numero += 2) {
            System.out.println("Numero par: " + numero);
        }

        // suma de numeros del 1 al 8
        int suma = 0;
        for (int m = 1; m <= 8; m++) {
            suma += m; // suma = suma + m

        }
        System.out.println("Suma es: " + suma);

        // Cuenta regresiva
        for (int cuenta = 10; cuenta >= 0; cuenta--) {
            System.out.println("Cuenta regresiva: " + cuenta);
        }
    }
}
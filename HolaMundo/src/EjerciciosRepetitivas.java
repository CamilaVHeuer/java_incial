// hacer un programa que dado por teclado un límite numérico, muestre en pantalla todos los números hasta ese número.
//por ejempli, si ingreso 100, que cuente hasta 100 y muestre todos eos numeros.
//sería un bucle controlado por contador, porque voy a tener un contador que va desde 1 hasta el número ingresado.

import java.util.Scanner;

public class EjerciciosRepetitivas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número límite hasta el que quiere contar:");
        int limite = teclado.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }

        // haciendo por while
        int contador = 1;
        while (contador <= limite) {
            System.out.println("Estoy en la vuelta: " + contador);
            contador++;
        }

        // realizar un programa que muestre por pantalla los numeros del 200 al 250 de 2
        // en 2.
        for (int variable = 200; variable <= 250; variable += 2) {
            System.out.println(variable);
        }

        // si uso un while
        int numero = 200;
        while (numero <= 250) {
            System.out.println("Número: " + numero);
            numero += 2;
        }

        // bucle controlado por centinela.
        // Programa que muestre por pantalla palabras ingresadas por el usuario hasta
        // que ingrese la palabra "salir"
        // mi centinela es "Salir"
        // for no puedo usar porque es exclusivo para bucles controlados por contador
        // Do- While no puedo usar porque con do-while si o si me va a ejecutar al menos
        // una vez, y si la persona ingresa Salir al inicio, me va a mostrar igual una
        // vez la palabra, y la consigna es que muestre todas hasta salir

        System.out.println("Ingrese una palabra (ingrese 'salir' para terminar):");
        Scanner palabra_ingresada = new Scanner(System.in);
        String palabra = palabra_ingresada.next();

        // para comparar cadenas no puedo usar == o !=, sino qe debo usar el metodo
        // equals o equalsIgnoreCase para no tener en cuenta mayusculas o minusculas, ya
        // que sabemos que el usuario puede ingresar SALIR, salir, Salir, SaLiR, etc.
        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("Usted ingresó: " + palabra);
            System.out.println("Ingrese otra palabra (ingrese 'salir' para terminar):");
            palabra = palabra_ingresada.next();
        }

    }
}

/*Suponer un sistema de reserva de asientos para un anfiteatro.
 * El teatro tiene 10 filas, cada una con 10 asientos. (matriz 10x10)
 * Desarrollar un sistema (sin uso de BD, solo manejo de datos de forma lógica) que permita:
 * 
 * 1: Cargar el ampa de filas y asientos, indicando con X los asientos ocupados y con L los libres. Al iniciar todos deben estar L.
 * 
 * 2: Manejar la reserva de asientos contemplando que un siento solo puede reservarse si está L, en caso de estar X se debe permitir al comprador elegir otro. Si se encuentra en L debe pasar a X automaticamente.
 * 
 * 3 Para fianlizar el programa se deberá ngresar un valor en particular. Contemplr que no existe una cantidad exacta de veces que el program se pueda ejecutar (ya se que es controlado por centinela entonces).
 * 
 * 4: Contemplar que no se pueden vender asientos por fuera de la numeracion existente. No puede haber sobreventa. (100 asientos en total)
 * 
 * Consideraciones: no se necesita implementar IGU ni BD, solo 100% de manejo logico del desarrollo de la app. 
 * 
 * Extra: si un cliente solicita visualizar cuales son los asientos libres el sistema debe permitir mostrar de forma gráfica el mapa de asientos. No utilizar IGU en este caso. Utilizar unicamente lógica y salida por consola. 
 */

import java.util.Scanner;

public class PruebaTecnicaTrainee {
    public static void main(String[] args) {

        // declaracion de variables
        char asientos[][] = new char[10][10];
        boolean flag = false;
        Scanner teclado = new Scanner(System.in);
        int fila = 0, asiento = 0;
        Scanner teclado1 = new Scanner(System.in);
        String confirmacion;
        String verMapa;

        // carga de valores
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                asientos[f][c] = 'L';
            }
        }
        System.out.println("-------BIENVENIDO AL SISTEMA DE RESERVA DEL ANFITEATRO--------");
        // reserva
        while (flag != true) {
            System.out.println("¿Desea ver los asientos disponibles? Si/cualquir otra tecla");
            // llamar al metodo para mostrar los aisnetos disponibles.
            verMapa = teclado1.next();
            if (verMapa.equalsIgnoreCase("si")) {
                dibujarMapa(asientos);
            }

            boolean estaOK = false;
            while (estaOK != true) {
                System.out.println("\n Ingrese la FILA y ASIENTO que dese reservar");
                System.out.print("Fila (entre 0 y 9): ");
                fila = teclado.nextInt();

                System.out.print("Asiento(entre 0 y 9): ");
                asiento = teclado.nextInt();

                if (fila >= 0 && fila <= 9) {
                    if (asiento >= 0 && asiento <= 9) {
                        estaOK = true;
                    } else {
                        System.out.println("numero de asiento no valido");
                    }
                } else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            // no puedo usar equals porque char no es un objeto, si definia asientos como
            // string ahi si. Char es un tipo de dato primitivo.
            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento seleccionado ha sido reservado correctamente");
            } else {
                System.out.println("El asiento está ocupado, por favor elija otro");
            }
            // colocar la pregunta en este punto, por fuera del if-else anterior evita que
            // tenga que repetir el codigo dentro de cada parte.
            System.out.println("¿Desea finalizar la reserva? Escriba si o cualquier otra tecla para no");
            confirmacion = teclado1.next();

            if (confirmacion.equalsIgnoreCase("si")) {
                flag = true;
                System.out.println("Gracias por reservar. Hasta la proxima");

            }
        }

    }

    // fuera del main y dentro de la clase hago el método para mostrar asientos,
    // pongo void porque no retorno nada, es un procedimiento, no devuelve ningun
    // valor, solo realiza una tarea
    static void dibujarMapa(char asientos[][]) {
        for (int f = 0; f < 10; f++) {
            System.out.print(f + "");
            for (int c = 0; c < 10; c++) {
                System.out.print("[" + asientos[f][c] + "]");
            }
            System.out.println("");
        }

    }
}


/* Una aerolinea cuenta con 6 destinos a os que realiza 3 vuelos diarios, uno de mañana, uno de mediodia y otro de noche. 
 * Para administrar los vuelos usa una matriz donde cada fila es un destino y en cada columna se guarda la cantidad de asientos disponibles. 
 * 1) Se necesita un programa que permita cargar la matriz con la cantidad de asientos por cada vuelo. 
 * 2) Debe permitir a un usuario ingresar el numero de destino, el turno del vuelo (el numero) y la cantidad de pasajes que necesita.
 * 3) a partir de la solicitud del usuario el programa debe controlar si hay stock de pasaje requeridos. -------------en caso de haber, se debe mostrar un cartel por pantalla que diga "reserva realizada con exito" y se debe actualizar al stock de pasajes.  De lo contrario se debe infromar al usuario. 
 * 
 * Desde la compañía informaron que no conocen cuantas ventas/reservas se hacen por dia, por lo cual, para finalizar las ventas se ingresa la palabra "finish". 
 * 
 */

//por lo ultimo se que es un bucle controlado por centinela. 

import java.util.Scanner;

public class EjerciciosAerolineas {
    public static void main(String[] args) {
        // carga de matriz con cantidad de asientos.
        int vuelos[][] = new int[6][3];
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out
                        .println("Ingrese la cantidad de asientos disponibles para el destino " + f + " horario " + c);
                vuelos[f][c] = teclado.nextInt();

            }
        }

        // venta de pasajes
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("ingrese el numero de destino:");
            destino = teclado.nextInt();
            System.out.println("ingrese el horario del vuelo (0 para mañana, 1 para mediodia, 2 para noche):");
            horario = teclado.nextInt();
            System.out.println("ingrese el numero de asientos que desea comprar");
            asientos = teclado.nextInt();
            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito");
                        // actualizo la matriz
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println(
                                "No se pudo realizar su reserva. No hay asientos disponibles para el destino y horario seleccionados.");
                    }
                } else {
                    System.out.println("horario invalido, por favor ingrese un horario entre 0 y 2");
                }
            } else {
                System.out.println("Destino no valido, por favor ingrese un destino entre 0 y 5");
            }

            System.out.println(
                    "Desea seguir reservando? escriba finish para finalizar o cualquier otro valor para continuar reservando");
            bandera = teclado2.next();

        }

    }
}

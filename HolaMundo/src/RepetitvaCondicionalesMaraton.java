/* En Oberá se realiza 1 vez al año la maraton del inmigrante en el marco de la fiesta nacional del inmigrante.
 * El evento cuenta con un dia de inscripciones el dia anterior a la carrera, por lo que se desconoce la cantidad de corredores que se inscribiran.
 * Desde la federacion de colectividades necesitan los siguientes datos para la inscripcion: dni, nombre y edad.
 * En cuanto a categorias posibles:
 * Menores A (de 6 a 10 años)
 * Menores B (de 11 a 17 años)
 * Juveniles (18 a 30 años)
 * Adultos (31 a 50 años)
 * Adultos mayores (mayores de 50 años)
 * Se necesita un programa que permita cargar los datos de los corredores y a partir de ello se muestre por pantalla la catgoria en la que competira cada corredor, o sea le indique al usuario a que categoria se debe inscribir
 * Al finalizar el dia, para dar fin a las inscripciones se debe ingresar un dni con el valor 0 y un nombre con la palabra fin. 
 */
//Tipo de bucle: controlado por centinela porque no se sabe la cantidad de corredores que se inscribiran
// hay dos centinelas: dni 0 y nombre "fin"

import java.util.Scanner;

public class RepetitvaCondicionalesMaraton {
    public static void main(String[] args) {
        // pedir datos dni, nombre, edad
        // determinar a que categoria perteenece
        // informar a la persona
        System.out.println("Bienvenido a la maraton del inmigrante. Por favor, ingrese sus datos para la inscripcion.");
        System.out.println("Ingrese el dni:");

        Scanner teclado = new Scanner(System.in);
        String dni = teclado.next();

        System.out.println("Ingrese el nombre:");
        String nombre = teclado.next(); // aca uso la misma variable teclado porque dni y nombre son strings, en cambio
                                        // para edad es int y compartir el mismo scanner con int puede traer problemas
                                        // al combinar distitnos tipos de datos.

        System.out.println("Ingrese la edad:");
        Scanner teclado2 = new Scanner(System.in); // creo un nuevo scanner para evitar problemas al leer un int despues
                                                   // de leer strings
        int edad = teclado2.nextInt();

        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin")) {
            // determinar a que categoria se tiene que iscribir

            if (edad >= 6 && edad <= 10) {
                System.out.println("La persona pertenece a la categoria Menores A.");
            } else if (edad >= 11 & edad <= 17) {
                System.out.println("La persona pertenece a la categoria Menores B.");
            } else if (edad >= 18 && edad <= 30) {
                System.out.println("La persona pertenece a la categoria Juveniles.");
            } else if (edad >= 31 && edad <= 50) {
                System.out.println("La persona pertenece a la categoria Adultos.");
            } else if (edad > 50) {
                System.out.println("La persona pertenece a la categoria Adultos Mayores.");
            } else {
                System.out.println("La persona no cumple con la edad minima para participar en la maraton.");
            }
            System.out.println("Ingrese el dni:");
            dni = teclado.next();
            System.out.println("Ingrese el nombre:");
            nombre = teclado.next();
            System.out.println("Ingrese la edad:");
            edad = teclado2.nextInt();
        }
    }
}

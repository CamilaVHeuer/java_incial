
/* Ejercicio integrador de condicionales
 * 
 * Una despensa desea calcular los sueldos de sus empleaos. 
 * Los puestos son los siguientes:
 * 1- reositor
 * 2- cajero
 * 3- supervisor
 * 
 * Los sueldos son:
 * Repositor: $15.890 + un bono del 10%
 * Los cajeros: $25.630.89 fijos
 * Los supervisores: $35.560.20 en bruto al cual se les descuenta un 11% de jubilacion
 * 
 * El programa debe calcular y mostrar el sueldo final de un empleado segun su puesto.
 */
import java.util.Scanner; // impoprto la clase scanner para leer desde teclado

public class IntegradorCondicionales {
    public static void main(String[] args) {
        // arranco con dos variables, una para sueldo y otra para categoria
        double sueldo = 0.0; // lo inicializo en 0.0 porque si no me va a dar un error, ya que podria pasar
                             // por los condicionales y no tener ningun valor, entonces en el systemout..
                             // daría un error.. en cambio a ctegoria no inicializo porque la voy a pedir por
                             // teclado, tengo un scanener que me obliga a tener un valor antes de entrar al
                             // if
        int categoria;

        // Voy a pedir que ingrese por teclado la categoria del empleado
        System.out.println("Ingrese la categoria del empleado (1- Repositor, 2- Cajero, 3- Supervisor):");

        // Creo la variable para pedir la categoria, la llamo teclado para sber que es
        // lo que ingresa por teclado.
        // Uso la clase Scanner para leer desde teclado
        Scanner teclado = new Scanner(System.in); // tipo de variable scanner creame una variable que se llama teclado,
                                                  // de la clase scanner que me permita ingresar datos al sistema
        categoria = teclado.nextInt(); // lee un entero desde teclado y lo asigna a la variable categoria

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);

        } else if (categoria == 2) {
            sueldo = 25630.89;

        } else if (categoria == 3) {
            sueldo = 35560.20 - (35560.20 * 0.11);

        } else {

            System.out.println("Categoria invalida. Debe ingresar 1, 2 o 3.");
        }
        // para mostrar el sueldo solo si la categoria es valida
        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println(
                    "El sueldo final del empleado para la categoria seleccionada " + categoria + " es: $" + sueldo);
        }

    }
}
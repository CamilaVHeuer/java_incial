/*Ejercicio de logic de intercambio de variables.
 * Tengo una variable n1 que vale 20, una n2 que vale 30 y quiero intercambiar sus valores
 * Como se hace? a traves de una variable temporal o auxiliar.
 */
public class Intercambio_variables {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        System.out.println("Antes del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Intercambio de valores usando una variable temporal
        int temporal_variable = num1; // temporal_variable ahora vale 20
        num1 = num2; // num1 ahora vale 30
        num2 = temporal_variable; // num2 ahora vale 20

        System.out.println("Despues del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

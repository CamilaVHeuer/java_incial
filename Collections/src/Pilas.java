import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("mi pila: " + pila);
        System.out.println("mi pila esta vacia? " + pila.isEmpty());

        // recorrer con for each
        for (Integer numero : pila) {
            System.out.println("Numero: " + numero);
        }

        // agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        for (Integer numero : pila) {
            System.out.println("Numero: " + numero);
        }
        System.out.println("mi pila: " + pila);
        System.out.println("mi pila esta vacia? " + pila.isEmpty());

        // eliminar el elemento en la cima de la pila
        pila.pop(); // elimina el 5
        System.out.println("Esta el numero 3 en la pila? " + pila.search(3)); // devuelve la posicion (1-based) o -1 si
                                                                              // no esta
        System.out.println("Esta el numero 3 en la pila? " + pila.contains(3)); // devuelve true o false y se usa para
                                                                                // objetos.. search no funciona bien con
                                                                                // objetos
        System.out.println("ultimo agregado (cima): " + pila.peek());

    }
}

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // declaro e inicializo una lista enlazada de tipo Persona
        LinkedList<Persona> listaPersonas = new LinkedList<Persona>();
        // para poder usar los metodos propios de LinkedList debo usar LinkedList en vez
        // de List en la declaracion

        // agrego elementos a la lista, al final
        listaPersonas.add(new Persona(1, "Juan", 25));
        listaPersonas.add(new Persona(2, "Maria", 30));
        listaPersonas.add(new Persona(3, "Pedro", 40));
        listaPersonas.add(new Persona(4, "Ana", 22));

        // agregar al principio de la lista
        listaPersonas.add(0, new Persona(5, "Luis", 28));
        listaPersonas.addFirst(new Persona(6, "Sofia", 27)); // otra forma de agregar
        // al principio

        // borrar el primer elemento, aca lo hago por indice, lo cual no es eficiente
        listaPersonas.remove(3);

        // otra forma de eliminar es usando un for y buscar por un atributo (elemento
        // especifico)
        String nombreABuscar = "Juan";
        for (Persona p : listaPersonas) {
            if (p.getNombre().equals(nombreABuscar)) {
                listaPersonas.remove(p);
                break; // para evitar ConcurrentModificationException
            }
        }

        // recorrer por cada elemento foreach
        for (Persona p : listaPersonas) {
            // aca no necesito traer la posicion, porque ya me trae el objeto completo p
            System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());
        }

        System.out.println("La lista esta vacia? " + listaPersonas.isEmpty());
        // traer el primer y ultimo elemento
        System.out.println("Primer persona: " + listaPersonas.getFirst().toString());
        System.out.println("Ultima persona: " + listaPersonas.getLast().toString());
    }
}

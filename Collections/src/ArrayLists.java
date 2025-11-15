
import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // declaro una lista de tipo Persona y la inicializo
        List<Persona> listaPersonas = new ArrayList<Persona>(); // cree una posicion dinamica en memoria que va a
                                                                // guardar objetos de tipo Persona

        // agregar un objeto de tipo Persona a la lista
        // como no tengo ninun objeto de tipo Persona creado, creo uno nuevo dentro del
        // metodo add
        listaPersonas.add(new Persona(1, "Juan", 25));
        listaPersonas.add(new Persona(2, "Maria", 30));
        listaPersonas.add(new Persona(3, "Pedro", 40));
        listaPersonas.add(new Persona(4, "Ana", 22));
        System.out.println("Lista de personas agregadas: " + listaPersonas);

        // recorrer la lista
        // recorrer por inidice
        System.out.println("-------FOR------------");
        for (int i = 0; i < listaPersonas.size(); i++) {

            System.out.println("Prueba: " + listaPersonas.get(i).getNombre() + " " + listaPersonas.get(i).getEdad()); // me
                                                                                                                      // tengo
                                                                                                                      // que
                                                                                                                      // traer
                                                                                                                      // la
                                                                                                                      // posicion
                                                                                                                      // i
                                                                                                                      // y
            // despues llamar al metodo getNombre
            // para mostrar el nombre de la persona
            // en esa posicion
        }
        System.out.println("-------FOREACH------------");
        // recorrer por cada elemento foreach
        for (Persona p : listaPersonas) {
            // aca no necesito traer la posicion, porque ya me trae el objeto completo p
            System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());
        }

        // ver el tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaPersonas.size());
        // eliminar un elemento de la lista
        listaPersonas.remove(2); // elimino el elemento en la posicion 2 (Pedro)
        System.out.println("-------FOREACH DESPUES DE ELIMINAR------------");
        for (Persona p : listaPersonas) {
            System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());
        }

        // cambiar un elemento de la lista
        listaPersonas.set(1, new Persona(5, "Luis", 28)); // cambio el elemento en la posicion 1 (Maria) por un nuevo
                                                          // objeto Persona (Luis)
        System.out.println("-------FOREACH DESPUES DE MODIFICAR------------");
        for (Persona p : listaPersonas) {
            System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());
        }

        // ver los atributos del objeto en una posicion especifica
        System.out.println("numero de la persona en la posicion 0: " + listaPersonas.get(0).getNum());
        // cambiar un atributo del objeto en una posicion especifica
        listaPersonas.get(0).setNombre("Carlos"); // cambio el nombre de la persona en la posicion 0 (Juan) por Carlos
        System.out.println(
                "nombre de la persona en la posicion 0 despues de cambiarlo: " + listaPersonas.get(0).getNombre());

        // eliminar un objeto buscando por un atributo especifico
        String nombreABuscar = "Ana";
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getNombre().equals(nombreABuscar)) {
                listaPersonas.remove(i);
                break;
            }
        }

        System.out.println("-------FOREACH DESPUES DE ELIMINAR POR NOMBRE------------");
        for (Persona p : listaPersonas) {
            System.out.println("Nombre: " + p.getNombre() + " Edad: " + p.getEdad());
        }

        // limpiar la lista
        listaPersonas.clear();

        // la lista esta vacia?
        System.out.println("La lista esta vacia? " + listaPersonas.isEmpty());

    }
}

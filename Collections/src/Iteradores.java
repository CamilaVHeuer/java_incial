import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Iteradores {
    public static void main(String[] args) {
        // declaro e inicializo una lista de tipo String
        List<String> lista = new ArrayList<>();

        // agrego elementos a la lista
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Pera");
        lista.add("Uva");
        lista.add("Naranja");
        lista.add("Pera"); // elemento duplicado
        lista.add("Kiwi");

        // creo un iterador para la lista:
        // declaro la variable llamada iterador de tipo Iterator String y le asigno el
        // iterador de la lista, o sea un objeto iterador que sabe recorrer esa lista.

        Iterator<String> iterador = lista.iterator();

        // uso el iterador para recorrer la lista
        while (iterador.hasNext()) {
            String fruta = iterador.next();
            System.out.println("Fruta: " + fruta);
        }

        // reinicio el iterador para recorrer nuevamente la lista y agregar una fruta si
        // no está
        iterador = lista.iterator();
        String frutaAagregar = "Mango";
        ;
        boolean encontrado = false;

        while (iterador.hasNext()) {
            String fruta = iterador.next();
            if (fruta.equals(frutaAagregar)) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            lista.add(frutaAagregar);
        }
        System.out.println("Lista despues de agregar " + frutaAagregar + " si no estaba: " + lista);

        // CREAR NUEVO ITERADOR para eliminar elementos (o podia hacer todo en el mismo
        // while de recorrido, pero por aprendizaje lo separo.)
        // necesito un nuevo iterador porque el anterior ya llego al final de la lista y
        // por ende no entraría en este while.
        // tambien podria haber reiniciado el mismo iterador con iterador =
        // lista.iterator(); pero es para probar.

        Iterator<String> iteradorParaEliminar = lista.iterator();

        while (iteradorParaEliminar.hasNext()) {
            String fruta = iteradorParaEliminar.next();
            if (fruta.equals("Pera")) {
                iteradorParaEliminar.remove(); // elimina el elemento actual (Pera)
            }
        }
        System.out.println("Lista despues de eliminar Pera: " + lista);
    }
}
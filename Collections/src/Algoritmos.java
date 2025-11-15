import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Algoritmos {

    public static void main(String[] args) {
        // declaro una lista de String
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("Ana");
        listaNombres.add("Pedro");
        listaNombres.add("Maria");
        listaNombres.add("Luis");

        System.out.println("Lista original: " + listaNombres);

        // Ordenar la lista en orden ascendente
        Collections.sort(listaNombres);
        System.out.println("Lista ordenada ascendentemente: " + listaNombres);

        // Ordenar la lista en orden descendente
        List<String> listaAlreves = new ArrayList<>(listaNombres);
        Collections.sort(listaAlreves, Collections.reverseOrder());
        System.out.println("Lista ordenada descendentemente: " + listaAlreves);

        // Buscar un elemento en la lista
        String nombreABuscar = "Pedro";
        int indice = Collections.binarySearch(listaNombres, nombreABuscar);
        if (indice >= 0) {
            System.out.println(nombreABuscar + " encontrado en el indice: " + indice);
        } else {
            System.out.println(nombreABuscar + " no encontrado en la lista.");
        }

        // Mezclar la lista aleatoriamente
        Collections.shuffle(listaNombres);
        System.out.println("Lista mezclada aleatoriamente: " + listaNombres);

        // cuantas veces aparece un elemento en la lista
        int cont = Collections.frequency(listaNombres, "Juan");
        System.out.println("Juan aparece " + cont + " veces en la lista.");

        // intercambiar elementos en la lista
        Collections.swap(listaNombres, 0, 2);
        System.out.println("Lista despues de intercambiar posiciones 0 y 2: " + listaNombres);

        // buscar el elemento maximo y minimo: esto mas adecuado para listas de numeros
        String max = Collections.max(listaNombres);
        String min = Collections.min(listaNombres);
        System.out.println("Elemento maximo: " + max);
        System.out.println("Elemento minimo: " + min);
    }
}

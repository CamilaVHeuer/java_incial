import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    // declaro e iniciliazo: creo una variable de tipo Set (interfaz) y le asigno un
    // HashSet (implementacion)
    public static void main(String[] args) {
        Set<String> autos = new HashSet<String>();

        // agrego elementos al conjunto
        autos.add("Rojo");
        autos.add("Verde");
        autos.add("Azul");
        autos.add("Amarillo");
        autos.add("Rojo"); // no se agrega porque ya existe
        System.out.println("Conjunto de autos: " + autos);

        // ver si existe un elemento
        String colorBuscado = "Verde";
        if (autos.contains(colorBuscado)) {
            System.out.println("El color " + colorBuscado + " existe en el conjunto.");
        } else {
            System.out.println("El color " + colorBuscado + " no existe en el conjunto.");
        }

        // recorrer el conjunto
        for (String auto : autos) {
            System.out.println("Color de auto: " + auto);
        }

        // eliminar un elemento
        autos.remove("Azul");
        System.out.println("Conjunto de autos despues de eliminar Azul: " + autos);

        // tamaño del conjunto
        System.out.println("Tamano del conjunto: " + autos.size());

        // limpiar el conjunto
        autos.clear();
        System.out.println("Conjunto de autos despues de limpiar: " + autos);
    }
}

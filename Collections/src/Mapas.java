import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        // declara un HashMap
        Map<Integer, String> mapaEmpleados = new HashMap<>();

        // agregar elemetnos
        mapaEmpleados.put(12523, "Lara");
        mapaEmpleados.put(25634, "Juan");
        mapaEmpleados.put(38745, "Maria");
        mapaEmpleados.put(49876, "Pedro");
        mapaEmpleados.put(56987, "Ana");
        mapaEmpleados.put(67898, "Pepe");
        System.out.println("Mapa de empleados: " + mapaEmpleados);

        // preguntar si contiene una clave
        System.out.println("Contiene la clave 25634? " + mapaEmpleados.containsKey(25634));
        // si contiene un valor
        System.out.println("Contiene el valor 'Ana'? " + mapaEmpleados.containsValue("Ana"));
        boolean estaono = mapaEmpleados.containsValue("pepe");
        if (estaono == true) {
            System.out.println("Esta pepe");
        } else {
            System.out.println("No esta pepe");
        }

        // le pido todos los valores
        System.out.println("Valores del mapa: " + mapaEmpleados.values());

        // pido todas las claves
        System.out.println("Claves del mapa: " + mapaEmpleados.keySet());

        // quiero traer un valor asociado a una key
        String nombre = mapaEmpleados.get(38745);
        System.out.println("El empleado con legajo 38745 es: " + nombre);

        // eliminar un valor del mapa
        mapaEmpleados.remove(56987);
        System.out.println("Mapa de empleados despues de eliminar: " + mapaEmpleados);

        // tamaño del mapa
        System.out.println("Tamaño del mapa: " + mapaEmpleados.size());

        // recorrer el mapa
        for (Map.Entry<Integer, String> empleado : mapaEmpleados.entrySet()) {
            Integer clave = empleado.getKey();
            String valor = empleado.getValue();
            System.out.println("Legajo: " + clave + " Nombre: " + valor);
        }

        // recorrer solo los valores
        for (String empleado : mapaEmpleados.values()) {
            System.out.println("Empleado: " + empleado);
        }

        // recorrer solo las claves
        for (Integer legajo : mapaEmpleados.keySet()) {
            System.out.println("Legajo: " + legajo);
        }
    }
}

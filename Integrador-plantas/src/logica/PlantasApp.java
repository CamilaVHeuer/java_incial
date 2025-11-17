package logica;

public class PlantasApp {
    public static void main(String[] args) {

        // creo un objeto de cada clase de planta (Arbol, Flor, Arbusto)

        // Crear un Árbol
        Arbol arbolito = new Arbol("Roble", 0.8, "marrón", "caducas",
                "Roberto el Roble", 15.5, true, "templado");

        // Crear una Flor
        Flor florecita = new Flor("rosa", "Rosa", "primavera", 25,
                "Rosita", 0.4, true, "templado");

        // Crear un Arbusto
        Arbusto arbustito = new Arbusto(1.2, true, "Lavanda", "verde", "Lavi", 0.6, true, "mediterráneo");

        // Llamar al método presentarse() de cada planta
        System.out.println("=== PRESENTACIÓN DE LAS PLANTAS ===");
        arbolito.presentarse();
        System.out.println();

        florecita.presentarse();
        System.out.println();

        arbustito.presentarse();
        System.out.println();

        // Probando getters y setters
        System.out.println("=== CAMBIO DE DATOS ===");
        System.out.println("Altura original del árbol: " + arbolito.getAlturaTallo() + " metros");
        arbolito.setAlturaTallo(18.0);
        System.out.println("Nueva altura del árbol: " + arbolito.getAlturaTallo() + " metros");

        System.out.println("Color original de pétalos: " + florecita.getColorPetalos());
        florecita.setColorPetalos("blanco");
        System.out.println("Nuevo color de pétalos: " + florecita.getColorPetalos());
    }
}

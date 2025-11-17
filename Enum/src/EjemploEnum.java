public class EjemploEnum {

    // declaro de forma global dentro de la clase principal asi puedo usarlo en
    // todos lados
    enum Color {
        ROJO, AZUL, VERDE, AMARILLO, ANARANJADO, NEGRO, BLANCO
    }

    public static void main(String[] args) {

        Color colorRopa = Color.AMARILLO;
        System.out.println("El color de la Ropa es: " + colorRopa);

        // Recorro el enum con un for y uso el metodo values() que me devuelve un array
        // con todos los elementos del enum
        for (Color c : Color.values()) {
            System.out.println("El color es: " + c);

        }

        // metodo name()
        System.out.println("El valor de la constante guardada en colorRopa es: " + colorRopa.name());

        // metodo ordinal()
        System.out.println("La posicion de la constante guardada en colorRopa es: " + colorRopa.ordinal());

        // metodo valueOf(String name)
        System.out.println("Encontre: " + Color.valueOf("ANARANJADO"));

        // SI BUSCO ALGO QUE NO ESTÁ VA A LANZAR LA EXCEPCION ASI QUE TTRATO CON
        // TRY-CATCH
        try {
            System.out.println("Encontre: " + Color.valueOf("ANANJADO"));
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido");
        }

    }
}

public class Excepciones {
    public static void main(String[] args) {
        // probando dividir por cero y tratar la excepcion
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0!!!!");
        }
        // forma generica de manejer errores..en caso de multiples. Poner al final si no
        // siempre se ejecutará primero.
        catch (Exception e) {
            System.out.println("error general");
        }

        // Intentar acceder a una posicion que no existe

        try {
            int edades[] = { 15, 12, 23, 30 };
            System.out.println("La edad de la posicion 4: " + edades[4]);
        } catch (Exception e) {
            System.out.println("Intentaste acceder a una posicion que no existe");

        }

        // combino try-catch con el metodo setEdad que lanza una excepcion
        try {
            // llamno al metodo y le paso un valor negativo, que va a lanzar una excepcion
            setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("HUBO UN ERROR: " + e.getMessage());
        } finally {
            System.out.println("Finalizamos el programa igual");
        }

        // tambien puedo llamar al metodo que lanza la excepcion y no usr try-catch
        // porque es una excepcion unchecked.
        setEdad(-6);
        /*
         * ➡ Se lanza la excepción
         * ➡ No hay try-catch para atraparla
         * ➡ La excepción sube hasta el método main
         * ➡ El programa termina abruptamente
         * ➡ Nada debajo de esa línea se ejecuta
         */

        // Probando la excepción personalizada
        try {
            setEdadCorrecta(-10);
        } catch (EdadNegativaException e) {
            System.out.println("EXCEPCIÓN PERSONALIZADA: " + e.getMessage());
        }

    }

    // Para probar throw: creo un metodo donde se validad una edad y lanza una
    // excepcion
    // aca no necesito declarar la excepcion en el metodo porque es unchecked
    public static void setEdad(int edad) {
        if (edad < 0) {
            // lanzo la excepciona a proposito
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        System.out.println("edad valida: " + edad);
    }
    // en este ejemplo l exception es propia de java y el constructor me permite
    // escribir un mensaje opcional.
    // si quiero crear mi propia excepcion con mensaje debo crear una clase que
    // herede de Exception y usar su constructor.
    // creo EdadNegativaException

    // creo un nuevo metodo que use mi excepcion personalizada y debo declarar la
    // excepcion en el metodo porque es una checked exception (porque heredé de
    // Exception)
    public static void setEdadCorrecta(int edad) throws EdadNegativaException {
        if (edad < 0) {
            // lanzo la excepciona a proposito
            throw new EdadNegativaException("La edad no puede ser negativa");
        }
        System.out.println("edad valida: " + edad);
    }

}

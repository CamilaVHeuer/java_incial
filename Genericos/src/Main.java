public class Main {
    public static void main(String[] args) {
        // quiero hacer una caja de String

        Caja<String> cajaString = new Caja<>();
        // llamo al metodo ponerAlgo y le paso algo que quiera guardar
        cajaString.ponerAlgo("Hola, aqui guardamos Strings");

        // reo una variable donde guarde el retorno de la funcion obtenerAlgo
        String queTiene = cajaString.obtenerAlgo();
        System.out.println("lo que tiene es: " + queTiene);

        // Ahora quiero una caja de enteros
        Caja<Integer> cajaEnteros = new Caja<>();
        // pongo algo para guardar
        cajaEnteros.ponerAlgo(30);
        int numeroGuardado = cajaEnteros.obtenerAlgo();
        System.out.println("El numero guardado es: " + numeroGuardado);
    }

}

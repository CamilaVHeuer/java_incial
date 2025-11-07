public class Cadenas {
    public static void main(String[] args) {
        // longitud de cadena
        String texto = "Hola, Camila!";
        System.out.println("La longitud del texto es: " + texto.length());

        // convertir todo a mayusculas
        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayusculas: " + textoMayusculas);

        // convertir texto aminusculas
        String textoMinusculas = texto.toLowerCase();
        System.out.println("Texto en minusculas: " + textoMinusculas);

        // Encontrar una subcadena en un texto usar el indexOf()
        System.out.println("La posicion de 'Camila' en el texto es: " + texto.indexOf("Camila"));

        // Encontrar un caracter en una cadena usar el charAt()
        System.out.println("En la posicion 0 del texto hay: " + texto.charAt(0));

        // Comparacion de cadenas, usar equals, devuelve True o False,
        // texto1.equals(texto2)
        String texto2 = "Hola, Camila!";
        System.out.println("¿Los textos son iguales? " + texto.equals(texto2));

        // Eliminar espacios en blanco al inicio y al final de una cadena, usar trim()
        String textoConEspacios = "   Hola, Camila!   ";
        System.out.println("Texto sin espacios: '" + textoConEspacios.trim());

        // concatenacion de cadenas
        String saludo = "Hola";
        String nombre = "Camila";
        String mensajeCompleto = "Este es un saludo para " + nombre + ", " + saludo + "!";
        System.out.println(mensajeCompleto);

    }
}

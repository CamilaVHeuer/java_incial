public class Metodos {
    // crear un metodo con una variable edad y nombre
    // static indica que el metodo pertenece a la clase Metodos, no a los objetos de
    // la clase
    // void que no retorna nada
    static void personificar(String nombre, int edad) {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años");
    }

    // metodo para checkear la edad
    static void checkEdad(int edad) {
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("eres mayor de edad");
        }
    }

    // un metodo que retorne un valor: reemplazar la palabra void por el tipo de
    // dato primitivo que quiero retornar y usar return

    static int sumarNumeros(int x, int y) {
        return x + y;
    }

    static int tablaDel2(int x) {
        return x * 2;
    }

    // Solo se pueden ejecutar a través del main metodo
    public static void main(String[] args) {
        personificar("Juan", 30);
        personificar("Jenny", 25);
        personificar("Anja", 18);

        checkEdad(20);
        // llamo al metodo sumarNumeros
        int resultado = sumarNumeros(5, 3);
        System.out.println(resultado);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tablaDel2(i));
        }
    }

}

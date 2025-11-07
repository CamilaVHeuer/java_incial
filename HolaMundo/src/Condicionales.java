public class Condicionales {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        if (num1 > num2) {
            System.out.println("num1 es mayor que num2");
        } else {
            System.out.println("num1 no es mayor que num2");
        }

        // else if
        int clima = 2;
        if (clima == 1) {
            System.out.println("El clima es soleado");
        } else if (clima == 2) {
            System.out.println("El clima es nublado");
        } else {
            System.out.println("El clima es lluvioso");
        }

        // operador ternario para condicionales simples
        int edad = 18;
        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(resultado);

        // otro ejemplo. Quiero saber segun el promedio si un alumno está aprobado o no
        double promedio;
        String estado;
        // pido el promedio por teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.print("Ingrese el promedio del alumno: ");
        promedio = teclado.nextDouble(); // leo el promedio desde teclado

        // uso el operador ternario para determinar si está aprobado o no
        estado = (promedio >= 6) ? "Aprobado" : "Reprobado";
        System.out.println("El alumno está: " + estado);
    }
}
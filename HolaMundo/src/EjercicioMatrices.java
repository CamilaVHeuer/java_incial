
/*  En una tabla de 4x4 se guardan notas de 4 alumnos de secundaria.
 * Cada fila corresponde a las notas y al promedio de cada alumno.
 * Se necesita un programa que permita al profesor cargar en 3 columnas de cada fila las notas y en la cuarta se calculen los promedios. 
 * Luego se desea mostrar las 3 notas de cada alumno y el promedio recorriendo la matriz.
  */
import java.util.Scanner;

public class EjercicioMatrices {
    public static void main(String[] args) {
        // 4 alumnos, 1 fila por alumno.

        double notas[][] = new double[4][4];
        // para calcular el promedio
        double suma = 0.0;
        // permitir cargar por teclado las notas
        Scanner teclado = new Scanner(System.in);

        // cargar las notas
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese las notas para el alumno " + (f + 1) + ": ");
                notas[f][c] = teclado.nextDouble();
                // aprovecho este for para ir sumando las notas
                suma = suma + notas[f][c];
            }
            // antes de pasar al sigueinte alumno calculo el promedio y lo guardo en la
            // columna 3 de la fila en la que estoy.
            notas[f][3] = suma / 3;
            suma = 0.0;
        }
        // Mostrar las notas y el promedio
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno " + (f + 1) + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota n° " + (c + 1) + " " + notas[f][c]);
            }
            // muestro el promedio antes de pasar al sigueinte alumno
            System.out.println("El promedio de las notas es: " + notas[f][3]);
        }

    }
}


/* En tres vectores diferente  se guardan los nombres, temperaturas minimas y maximas de 5 ciudades de Misiones. En el primer vector estan los nombres, en el segundo las temperaturas minimas y en el tercero las maximas alcanzadas en la ultima semana. 
Se necesita un programa que permita la carga de las ciudades, sus Tmin y Tmax; además deberá infromar cual due la ciudad con l T mas baja y cual con la T mas alta, informando al mismo tiempo la cantidad de grados. 
*/
import java.util.Scanner;

public class VectoresTemperatura {
    public static void main(String[] args) {
        // vector de ciudades
        String ciudades[] = new String[5];
        // Vector de Tmax
        Double Tmax[] = new Double[5];
        // Vector t min
        Double Tmin[] = new Double[5];

        Scanner tecladoString = new Scanner(System.in);
        Scanner tecladoDou = new Scanner(System.in);

        // carga de vectores
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre de la cuidad " + (i + 1) + ":");
            ciudades[i] = tecladoString.next();
            System.out.println("Ingrese la temperatura mínima de la ciudad " + (i + 1));
            Tmin[i] = tecladoDou.nextDouble();
            System.out.println("Ingrese la temperatura maxima de la ciudad " + (i + 1));
            Tmax[i] = tecladoDou.nextDouble();

        }
        // Determinar la minima y maxima

        // me creo una variable auxiliar para comparar
        double minima = 9999999.00;
        int posMin = -1;
        double maxima = -9999999.00;
        int posMax = -1;
        for (int i = 0; i < Tmin.length; i++) {
            if (Tmin[i] < minima) {
                minima = Tmin[i];
                posMin = i;
            }
            if (Tmax[i] > maxima) {
                maxima = Tmax[i];
                posMax = i;
            }
        }

        System.out.println("La temperaura minima es de: " + minima);
        System.out.println("Se registró en la ciudad de: " + ciudades[posMin]);

        System.out.println("La temperaura mmaxima es de: " + maxima);
        System.out.println("Se registró en la ciudad de: " + ciudades[posMax]);

    }
}

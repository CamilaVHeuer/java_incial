/* Programa que dibuja un arbolito de navidad 
Filas: 4
Espacios:
  Arranca de filas -1
  Termina en 0
Asteriscos: 1,3,5,7 */

public class ArbolitoNavidad {
    public static void main(String[] args) {
        // Dibujar el arbolito de navidad
        // altura del arbolito
        int altura = 4;
        // bucle para las filas/altura del arbolito
        for (int fila = 1; fila <= altura; fila++) {
            // bucle para los espacios
            for (int espacios = 1; espacios <= (altura - fila); espacios++) {
                System.out.print(" ");
            }
            // bucle para los asteriscos
            for (int asteriscos = 1; asteriscos <= (2 * fila - 1); asteriscos++) {
                System.out.print("*");
            }
            System.out.println(); // salto de linea para la siguiente fila, para que no quede todo en la misma
                                  // linea
        }
        // dibujar el tronco del arbolito, de 3 columnas de ancho y 1 fila de alto
        int alturaTronco = 1;
        // bucle para la fila/altura del tronco
        for (int filaTronco = 1; filaTronco <= alturaTronco; filaTronco++) {
            // espacios antes del tronco
            for (int espacios = 1; espacios < (altura - 1); espacios++) {
                System.out.print(" ");
            }
            // barritas del tronco
            for (int tronco = 1; tronco <= 3; tronco++) {
                System.out.print("|"); // imprimir el tronco

            }
            System.out.println(); // salto de linea final

        }
    }
}
public class App {
    public static void main(String[] args) {

        Circulo circ = new Circulo(1.2);

        Cuadrado cuad = new Cuadrado(2.0); // Cambié 2 por 2.0 (double)

        System.out.println("El area del circulo es: " + circ.calcularArea());

        circ.rotar();
        circ.dibujar();

        System.out.println("El area del cuadrado es: " + cuad.calcularArea());

        cuad.dibujar();

    }
}

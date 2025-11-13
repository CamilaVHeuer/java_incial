public class Cuadrado extends Figura {

    // agrego su atributo para poder calcular su area
    private double lado;

    // agrego su constructor para poder instancia la clase
    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;

    }
}

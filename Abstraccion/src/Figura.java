public abstract class Figura {
    protected double x; // posicion en x
    protected double y; // posicion en y

    // declaro su constuctor igualmente
    protected Figura() {
    };

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // declaro el metodo abstracto
    public abstract double calcularArea();

}

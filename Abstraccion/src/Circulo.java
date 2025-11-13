public class Circulo extends Figura {
    // agrego el atributo de circulo para poder calcular su area
    private double radio;

    // constructor vacio
    public Circulo() {
    };

    // constructor con parametros
    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    // sobreescribo el metodo abstracto de la clase Figura
    @Override
    public double calcularArea() {
        double resultado = Math.PI * Math.pow(radio, 2);
        return resultado;

    }

}

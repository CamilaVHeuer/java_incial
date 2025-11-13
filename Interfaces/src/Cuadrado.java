public class Cuadrado implements Figura, Dibujable {
    private double lado;

    // agrego su constructor para poder instancia la clase
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // sobreescribo el metodo abstracto de Figura
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;

    }

    // implemento el metodo dibujar de Dibujable
    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado");
    }

}

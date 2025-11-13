public class Circulo implements Figura, Rotable, Dibujable {
    // agrego el atributo de circulo para poder calcular su area
    private double radio;

    // constructor vacio
    public Circulo() {
    };

    // constructor con parametros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // sobreescribo el metodo abstracto de la clase Figura
    @Override
    public double calcularArea() {
        double resultado = Math.PI * Math.pow(radio, 2);
        return resultado;

    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }
}
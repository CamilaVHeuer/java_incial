package logica;

public class Flor extends Planta {

    // atributos
    private String colorPetalos;
    private String variedad;
    private String estacionFlorece;
    private int cantidadPetalos;

    // constructor
    public Flor(String colorPetalos, String variedad, String estacionFlorece, int cantidadPetalos,
            String nombre, double alturaTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal); // Llama al constructor de Planta

        // Inicializa solo los atributos propios de Flor
        this.colorPetalos = colorPetalos;
        this.variedad = variedad;
        this.estacionFlorece = estacionFlorece;
        this.cantidadPetalos = cantidadPetalos;
    }

    // Getters y setters para atributos propios de Flor
    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacionFlorece() {
        return estacionFlorece;
    }

    public void setEstacionFlorece(String estacionFlorece) {
        this.estacionFlorece = estacionFlorece;
    }

    public int getCantidadPetalos() {
        return cantidadPetalos;
    }

    public void setCantidadPetalos(int cantidadPetalos) {
        this.cantidadPetalos = cantidadPetalos;
    }

    // Implementación del método abstracto presentarse
    @Override
    public void presentarse() {
        System.out.println("Hola, soy una flor " + variedad +
                " con pétalos de color " + colorPetalos +
                ". Tengo " + cantidadPetalos + " pétalos" +
                " y florezco en " + estacionFlorece +
                ". Mi nombre es " + nombre + ".");
    }
}

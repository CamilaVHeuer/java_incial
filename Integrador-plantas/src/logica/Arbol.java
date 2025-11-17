package logica;

public class Arbol extends Planta {
    private String variedad;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    // constructor
    public Arbol(String variedad, double radioTronco, String color, String tipoHojas, String nombre, double alturaTallo,
            boolean tieneHojas, String climaIdeal) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal); // Llama al constructor de Planta

        // Inicializa solo los atributos propios de Arbol
        this.variedad = variedad;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    // Getters y setters para atributos propios de Arbol
    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    // implementacion del metodo abstracto presentarse:
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un árbol de variedad " + variedad +
                ", mi color es " + color +
                " y mi nombre es " + nombre +
                ". Mido " + alturaTallo + " metros de altura.");
    }
}

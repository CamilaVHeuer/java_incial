package logica;

public class Arbusto extends Planta {
    // atributos
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;

    // constructor
    public Arbusto(double anchoArbusto, boolean esDomestico, String variedad, String colorHojas,
            String nombre, double alturaTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, alturaTallo, tieneHojas, climaIdeal); // Llama al constructor de Planta

        // Inicializa solo los atributos propios de Arbusto
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
    }

    // Getters y setters para atributos propios de Arbusto
    public double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    // Implementación del método abstracto presentarse
    @Override
    public void presentarse() {
        String tipo = esDomestico ? "doméstico" : "silvestre";
        System.out.println("Hola, soy un arbusto " + variedad +
                " de tipo " + tipo +
                ". Mis hojas son de color " + colorHojas +
                " y tengo " + anchoArbusto + " metros de ancho" +
                ". Mi nombre es " + nombre + " y mido " + alturaTallo + " metros de altura.");
    }
}

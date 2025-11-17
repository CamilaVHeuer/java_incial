package logica;

public abstract class Planta {
    // atributos
    protected String nombre;
    protected double alturaTallo;
    protected boolean tieneHojas;
    protected String climaIdeal;

    // Constructor
    public Planta(String nombre, double alturaTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.alturaTallo = alturaTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    // getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlturaTallo() {
        return alturaTallo;
    }

    public void setAlturaTallo(double alturaTallo) {
        this.alturaTallo = alturaTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    // metodo abstracto
    public abstract void presentarse();

}

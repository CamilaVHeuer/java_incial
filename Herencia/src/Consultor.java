public class Consultor extends Persona {
    String nombre_conssultora;
    String numero_consultor;

    // constructor vacio
    public Consultor() {

    }

    // constructor con parametros heredados mas los nuevos
    // paso los nuevos y luego los de la clase madre
    public Consultor(String nombre_conssultora, String numero_consultor, int id, String dni, String nombre,
            String apellido,
            String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono); // asignacion de la clase madre
        this.nombre_conssultora = nombre_conssultora;
        this.numero_consultor = numero_consultor;
    }

    // getters y setters propios
    public String getNombre_conssultora() {
        return nombre_conssultora;
    }

    public void setNombre_conssultora(String nombre_conssultora) {
        this.nombre_conssultora = nombre_conssultora;
    }

    public String getNumero_consultor() {
        return numero_consultor;
    }

    public void setNumero_consultor(String numero_consultor) {
        this.numero_consultor = numero_consultor;
    }
}
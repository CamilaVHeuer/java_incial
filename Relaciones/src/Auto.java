import java.util.List;

public class Auto {
    private Long id;
    private String marca;
    private String modelo;

    // para crear la relacion con propietario creo como atributo de auto, un objeto
    // de tipo Propietario (o sea de la clase con la que lo quiero relacionar)
    // para relacion 1 a 1
    // private Propietario prop;

    // para relacion 1 a N creo una collection del lado del 1
    private List<Propietario> listaPropietarios;

    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public List<Propietario> getListaProp() {
        return listaPropietarios;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProp(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", propietarios=" + listaPropietarios +
                '}';
    }
}

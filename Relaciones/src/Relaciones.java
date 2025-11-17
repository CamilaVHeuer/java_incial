import java.util.List;
import java.util.ArrayList;

public class Relaciones {
    public static void main(String[] args) {

        // creo un auto vacio y asigno parametros
        Auto aut = new Auto();

        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");

        // creo un arraylist para poder pasar propietarios
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        // creo propietarios
        Propietario prop1 = new Propietario(35L, "Luisa", "Marcel");
        Propietario prop2 = new Propietario(23L, "Marcos", "Junior");

        // agrego a la listaPropietarios los prop1 y prop2 (UNO POR UNO)
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        // asigno los propietarios al auto
        aut.setProp(listaPropietarios);

        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " tiene como dueños a: "
                + aut.getListaProp().toString());

    }

}

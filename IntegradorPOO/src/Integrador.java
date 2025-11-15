public class Integrador {
    public static void main(String[] args) {

        // creo objetos de cada clase de pokemon
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu(125, "Pikachu", 6.0, "Macho", 1);

        // llamo a los metodos de los objetos/los ataques
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();

        bulba.atacarAraniazo();
        bulba.atacarDrenaje();

        pika.atacarAraniazo();
        pika.atacarImpactrueno();

        // ver atributos: puedo acceder directamente porque los atributos son protected
        System.out.println("Nombre: " + pika.nombre);
        // accedo a los atributos mediante los getters, mejor practica
        System.out.println("Nombre: " + pika.getNombre());

    }
}

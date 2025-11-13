public class Pikachu extends Pokemon implements IElectrico {

    // constructor vacio
    public Pikachu() {
    }

    // constructor no vacio, solo para probar
    public Pikachu(int num_pokedex, String nombre, double peso, String sexo, int temporada) {
        super(); // llamo al constructor vacio generado automaticamente en la clase madre

        // inicializo los atributos heredados de forma manual
        this.numPokedex = num_pokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }

    // sobreescribo los metodos de la clase madre pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    // sobreescribo los metodos de la interface
    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunio() {
        System.out.println("Hola soy Pikachu y este es mi ataque de punio");
    }
}

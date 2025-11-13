public class Charmander extends Pokemon implements IFuego {

    // constructor vacio
    public Charmander() {
    }

    // sobreescribo los metodos de la clase madre pokemon
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmandery este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");
    }

    // sobreescribo los metodos de la interface
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque punio de fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }

}

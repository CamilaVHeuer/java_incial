//clase abstracta para establecer los atributos y metodos comunes a todos los pokemones

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    // todos tienen que poder tener 3 ataques

    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordisco();
}

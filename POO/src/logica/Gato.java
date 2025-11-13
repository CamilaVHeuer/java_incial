public class Gato extends Animal {

    // no defino un constructor para verificar que puedo crear un objeto gato ya que
    // al tener un constructor vacio la madre, java automaticamente crea un
    // constructor vacio para la hija.
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

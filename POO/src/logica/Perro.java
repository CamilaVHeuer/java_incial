public class Perro extends Animal {

    public Perro() {
    };

    @Override // aunque no lo ponga, al llamar a este metodo desde el objeto perro funciona y
              // llama exacto a este metodo y es porque java busca primero en la clase del
              // objeto, si no lo encuentra busca en la clase amdre y asi sucesivamente.
    // pero es una buena practica ponerlo porque se detectan errores en tiempo de
    // compilacion, si escribí mal el nombre del metodo y no pongo la anotacion, voy
    // a crear un nuevo metodo.
    public void hacerSonido() {
        System.out.println("El perro ladra");
    };

}

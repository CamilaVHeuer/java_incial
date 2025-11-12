public class Herencia {
  public static void main(String[] args) {

    // instancio un empleado
    Empleado empl1 = new Empleado();

    empl1.getId();
    empl1.setNombre("Camila");

    Consultor cons1 = new Consultor();
    cons1.setNombre("Ana");
    cons1.getApellido();

  }
}

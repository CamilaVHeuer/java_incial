public class Herencia {
  public static void main(String[] args) {

    // instancio un empleado
    Empleado empl1 = new Empleado();

    empl1.getId();
    empl1.setNombre("Camila");

    Consultor cons1 = new Consultor();
    cons1.setNombre("Ana");
    cons1.getApellido();

    // para poliformismo
    // un vector para guardar personas, pero pueden ser jefe, empleados o
    // consultores
    // creo un vector de tipo persona
    Persona vector[] = new Persona[5];
    // asignacion de objetos de distintas clases al vector
    vector[0] = new Persona(); // persona vacia
    vector[1] = new Empleado();
    vector[2] = new Jefe();
    vector[3] = new Consultor();
    // guardé distintos objetos en el mismo vector de tipo Persona, porque Persona
    // es la superclase

    // pruebo con objetos
    Persona perso = new Persona();
    Consultor consul = new Consultor();
    perso = consul; // al objeto persona le puedo asignar un objeto consultor..
    // consul = perso; asi no puedo porque un consultor es una persona, pero una
    // persona no necesariamente es un consultor

    // probando accesos
    Persona persona1 = new Persona(1, "39045789", "Mario", "Suarez", "AV siempre viva", "75489631");
    // no puedo acceder directamente porque es el apellido es privado
    // System.out.println(persona1.apellido);

    // debo usar el metodo getApellido() que es publico
    System.out.println(persona1.getApellido());

  }
}

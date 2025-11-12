public class POO {
    public static void main(String[] args) {
        // creo un objeto de la clase alumno, instancio la clase
        // nombreClase nombreobjeto = new constructor ()
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(1, "Lara", "Villalba");

        System.out.println("------------------");

        System.out.println("el id del alumno 2 es: " + alu2.getId());
        System.out.println("el nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println(alu2.apellido);
        System.out.println("el apellido del alumno 2 es: " + alu2.getApellido()); // aca acceso al apellido usando el
        // metodo getApellido que creé y que es
        // PUBLICO.
        System.out.println("------------------");
        // usando el set para asignar valores a los atruibutos del objeto alumno creado
        // con el constructor vacio.

        alu1.setId(8);
        alu1.setNombre("Romina");
        alu1.setApellido("Diaz");

        System.out.println("------------------");
        System.out.println("el id del alumno 1 es: " + alu1.getId());
        System.out.println("el nombre del alumno 1 es: " + alu1.getNombre());
        System.out.println("el apellido del alumno 1 es: " + alu1.getApellido());
        System.out.println("------------------");
        // modificar un valor de atributo con set
        // modifico al alumno dos
        alu2.setId(35);

        System.out.println("el id del alumno 2 es: " + alu2.getId());
        System.out.println("el nombre del alumno 2 es: " + alu2.getNombre());
        System.out.println("el apellido del alumno 2 es: " + alu2.getApellido());
        // modificar el apellido del alu2 sin usar setter
        alu2.apellido = "Roque";
        System.out.println("el apellido del alumno 2 es: " + alu2.getApellido());

    }

}

//creo una clase llamada alumno con 3 atributos. 
//clase "public" (modificador de acceso)
public class Alumno {
    int id;
    String nombre;
    String apellido;

    // constructor vacio:
    /*
     * mismo nombre que la clase
     * no tiene tipo
     * no recibe parametros
     * no tiene valores adentro
     * para que sirve: cuando voy a cargar los datos en el futuro
     */
    public Alumno() {
    }

    // Constuctor con prametros
    // tener en cuenta que las variables que paso por parametro tienen el mismo
    // nombre que los atributos declarados en la clase. No importa (y no da error)
    // porque estas variables son locales y las otras globales.
    public Alumno(int id, String nombre, String apellido) {
        this.id = id; // al id de esta clase, o sea al atrubuto id de esta clase asignale el valor de
                      // id que recibo por parametro. Si no usara la palabra this como la variable de
                      // clase (atributo) y el parametro que recibe tienen el mismo nombre, dentro del
                      // constructor se establecería el parametro igual a si mismo y la variable de
                      // clase permanecería sin inicializarse.
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // Getters y setters: getters --> funciones, setters--> Procedimientos
    // pr cada atributo de la clase: 1 getter y 1 setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // metodos: para armarlos:
    /*
     * 1: poner el modificador de acceso
     * 2: tipo de dato que va a devolver en caso de que lo haga
     * En caso que no devuelva nada para utilizar despues se usa el tipo void, esto
     * me indica que es un Procedimiento
     * Recordar que esto es algo que luego (a futuro) el objeto que cree va a poder
     * implementar/usar
     */

    public void mostrarNombre() {
        System.out.println("Hola soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion) {
        if (calificacion <= 6) {
            System.out.println("Aprobé la materia");

        } else {
            System.out.println("uy, no aprobé");
        }
    }
}

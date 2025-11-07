public class Switcheando {
    public static void main(String[] args) {
        int dia = 8; // variable para interpretar el dia de la semana, del 1 al 7.
        String nombreDia; // variable para almacenar el nombre del dia

        // uso del switch, pongo switch (variable) y luego los casos case valor:
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break; // break para salir del switch
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default: // caso por defecto si no coincide con ningun case
                nombreDia = "Día no válido";
                // no es obligatorio el break en el default porque es la ultima instruccion
        }
        System.out.println("El día de la semana es: " + nombreDia);
    }
}

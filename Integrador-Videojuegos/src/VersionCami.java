import java.util.ArrayList;

public class VersionCami {
    public static void main(String[] args) {

        // creo un ArrayList de tipo VideoJuego (VJ) para guardar 5 VJ
        ArrayList<VideoJuego> listaVJ = new ArrayList<>();

        // creo 5 VJ y los guardo en la lista
        VideoJuego videojuego1 = new VideoJuego("FIFA-PS5", "EA Sports FIFA 24", "PlayStation 5", 4, 'D');
        VideoJuego videojuego2 = new VideoJuego("ZELDA-NSW", "The Legend of Zelda", "Nintendo Switch", 1, 'A');
        VideoJuego videojuego3 = new VideoJuego("GTAV-XBX", "Grand Theft Auto V", "Xbox Series X", 1, 'A');
        VideoJuego videojuego4 = new VideoJuego("MC-PC", "Minecraft", "PC Windows", 8, 'S');
        VideoJuego videojuego5 = new VideoJuego("MK11-PS5", "Mortal Kombat 11", "PlayStation 5", 2, 'L');

        listaVJ.add(videojuego1);
        listaVJ.add(videojuego2);
        listaVJ.add(videojuego3);
        listaVJ.add(videojuego4);
        listaVJ.add(videojuego5);

        // recorrer el ArrayList y mostrar el titulo, consola y cantidad de jugadores
        for (VideoJuego vj : listaVJ) {
            System.out.println("El titulo del juego es: " + vj.getTitulo() + ", la consola es: " + vj.getConsola()
                    + "y la cantidad de jugares es: " + vj.getCantJugadores());

        }

        // cambiar el nombre y cantidad de jugadores de 2 vj (el 1 y el 3 o 1 y 2),
        // luego
        // mostrar todos los datos de todos los vj
        /*
         * listaVJ.get(0).setTitulo("EA Sports FIFA 25");
         * listaVJ.get(0).setCantJugadores(6);
         * listaVJ.get(2).setTitulo("Grand Theft Auto VI");
         * listaVJ.get(2).setCantJugadores(2);
         */
        videojuego1.setTitulo("EA Sports FIFA 25");
        videojuego1.setCantJugadores(6);
        videojuego3.setTitulo("Grand Theft Auto VI");
        videojuego3.setCantJugadores(2);

        // Recorrer despues del cambio y mostrar todo
        System.out.println("\n=== Videojuegos después del cambio ===");
        for (VideoJuego vj : listaVJ) {
            System.out.println("Código: " + vj.getCodigo() +
                    ", Título: " + vj.getTitulo() +
                    ", Consola: " + vj.getConsola() +
                    ", Jugadores: " + vj.getCantJugadores() +
                    ", Categoría: " + vj.getCategoria());
        }

        // Recorrer la ArrayList y mostrar slo los vj que sean de consola PS5
        System.out.println("------------VideoJuego de PS5---------------");
        for (VideoJuego vj : listaVJ) {
            if (vj.getConsola().equals("PlayStation 5")) {
                System.out.println(vj.toString());
            }
        }

    }

}

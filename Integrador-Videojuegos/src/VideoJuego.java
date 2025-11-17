public class VideoJuego {
    // atributos
    private String codigo;
    private String titulo;
    private String consola;
    private int cantJugadores;
    private char categoria;

    // Constructor vacio y con parametros

    public VideoJuego() {
    }

    public VideoJuego(String codigo, String titulo, String consola, int cantJugadores, char categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }

    // getters: son funciones, retornan un valor
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConsola() {
        return consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public char getCategoria() {
        return categoria;
    }

    // setters: son PO, no retornan nada
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantJugadores=" + cantJugadores +
                ", categoria=" + categoria +
                '}';
    }
}

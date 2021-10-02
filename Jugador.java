public class Jugador {
    private String nombre;
    private int codigo;
    private int puntaje;
    private int valor;

    public Jugador(String nombre, int codigo, int puntaje, int valor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.puntaje = puntaje;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", puntaje=" + puntaje + ", valor=" + valor + "]";
    }
    
}

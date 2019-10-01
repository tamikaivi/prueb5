package Factory.ejercicios;

public class KitColegial implements IKit {
    Computadora computadora;
    Libros libros;
    Mochila mochila;

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public KitColegial() {

    }

    @Override
    public void create() {
        System.out.println("Creando Kit Colegial");
    }

}
package Factory.ejercicios;

public class CreadorConcreto2 extends Creador {
    @Override
    public KitColegial factoryMethodKit() {
        KitColegial kitColegial = new KitColegial();
        Computadora computadora = new Computadora();
        Libros libros = new Libros();
        Mochila mochila = new Mochila();
        kitColegial.setComputadora(computadora);
        kitColegial.setLibros(libros);
        kitColegial.setMochila(mochila);
        return kitColegial;
    }
}

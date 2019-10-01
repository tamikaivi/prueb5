package Factory.ejercicios;

public class CreadorConcreto extends Creador {
    @Override
    public KitEscolar factoryMethodKit() {
        KitEscolar kitEscolar = new KitEscolar();
        Mochila mochila = new Mochila();
        Deportivo deportivo = new Deportivo();
        Cuaderno cuaderno = new Cuaderno();
        kitEscolar.setMochila(mochila);
        kitEscolar.setDeportivo(deportivo);
        kitEscolar.setCuaderno(cuaderno);
        return kitEscolar;
    }
}

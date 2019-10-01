package Factory.ejercicios;

public class KitEscolar implements IKit {
    Mochila mochila;
    Deportivo deportivo;
    Cuaderno cuaderno;

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
    }

    public KitEscolar(){

    }
    @Override
    public void create() {
        System.out.println("Creando Kit Escolar");

    }
}

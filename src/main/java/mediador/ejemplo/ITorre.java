package mediador.ejemplo;

public interface ITorre {
    public  void send(String msg, Vuelo colleage, Vuelo receptor);
    public Vuelo getVuelo(int codigo);
}

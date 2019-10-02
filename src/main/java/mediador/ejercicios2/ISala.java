package mediador.ejercicios2;

public interface ISala {
    public  void send(String msg, Programadores programadores);
    public  void sendTodos(String msg, Programadores programadores);
    public Programadores getProgramador(int codigo);
}

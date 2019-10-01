package mediador.ejemplo;

public abstract class Vuelo {
    protected ITorre mediator;

    public Vuelo(ITorre mediator){
        this.mediator = mediator;
    }
    public  abstract  void  send(String msg, Vuelo receptor);
    public abstract void messageRecived(String msg);
}

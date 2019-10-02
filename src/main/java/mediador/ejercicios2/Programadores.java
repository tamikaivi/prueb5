package mediador.ejercicios2;

import java.util.HashMap;

public abstract class Programadores {
    protected ISala mediator;

    public Programadores(ISala mediator){
        this.mediator = mediator;
    }
    public  abstract  void  send(String msg, Programadores receptor);
    public  abstract  void  sendTodos(String msg);
    public  abstract  void  messageRecived(String msg);
}

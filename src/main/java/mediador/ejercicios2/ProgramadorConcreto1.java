package mediador.ejercicios2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProgramadorConcreto1 extends Programadores {
    public ProgramadorConcreto1(ISala mediator){
        super(mediator);
    }



    @Override
    public void send(String msg, Programadores receptor) {
        mediator.send(msg, receptor );
    }

    @Override
    public void sendTodos(String msg) {

        mediator.sendTodos(msg, this);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println("Programador 1 recive mensaje: "+msg);
    }


}

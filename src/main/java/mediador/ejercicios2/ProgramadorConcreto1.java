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
        mediator.send(msg, this, receptor );
    }

    @Override
    public void sendTodos(String msg) {
        mediator.sendTodos(msg, this);
    }


    @Override
    public void messageRecived(String msg, HashMap<Integer, Programadores> programadoresHashMap, Programadores receptor) {
        List<Integer> indexes = new ArrayList<Integer>(programadoresHashMap.keySet());
        System.out.println("Programador "+indexes.indexOf(programadoresHashMap)+"recibe message : "+msg);
    }

}

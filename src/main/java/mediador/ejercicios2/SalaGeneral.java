package mediador.ejercicios2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SalaGeneral implements ISala {

    HashMap<Integer, Programadores> elmapa = new HashMap<>();

    @Override
    public Programadores getProgramador(int codigo) {
        return elmapa.get(codigo);
    }

    public void addProgramador (int codigo, Programadores programadores){
        elmapa.put(codigo,programadores);
    }

    @Override
    public void send(String msg, Programadores colleage, Programadores receptor) {
        receptor.messageRecived(msg,elmapa,receptor);
    }

    @Override
    public void sendTodos(String msg, Programadores programadores) {
        List<Integer> indexes = new ArrayList<Integer>(elmapa.keySet());
        for ( Integer key : elmapa.keySet() ) {
            if(key != indexes.get(elmapa.getKey(programadores))){
                elmapa.get(key).messageRecived(msg,elmapa,elmapa.get(key));
            }
        }

    }
}

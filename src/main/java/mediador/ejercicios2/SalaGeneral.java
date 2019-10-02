package mediador.ejercicios2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SalaGeneral implements ISala {

    private Map<Integer, Programadores> elmapa = new HashMap<>();

    public void addProgramador (int codigo, Programadores programadores) {
        elmapa.put(codigo,programadores);
    }

    @Override
    public Programadores getProgramador(int codigo) {
        return elmapa.get(codigo);
    }


    @Override
    public void send(String msg, Programadores programadores) {
        System.out.println("Uno a Uno");
        programadores.messageRecived(msg);
    }

    @Override
    public void sendTodos(String msg, Programadores programadorEmi) {
        System.out.println("A todos");
        for (Entry<Integer, Programadores> prog : elmapa.entrySet()) {
            if(!prog.getValue().equals(programadorEmi)){
                    prog.getValue().messageRecived(msg);
            }
        }

    }
}

package iterator.ejercicios;

import java.util.LinkedList;
import java.util.List;


public class SegundaEmpresa implements IList {

    private int position;
    List<Empleados> clientes;

    public SegundaEmpresa(){
        position=0;
        clientes = new LinkedList<>();
    }

    public void add (Empleados value){
        clientes.add(value);
    }

    @Override
    public IteratorList2 iterator() {
        return new IteratorList2(this.clientes);
    }
}

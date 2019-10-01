package iterator.ejercicios;

import java.util.List;

public class IteratorList2 implements Iterator {

    private List<Empleados> clientes;
    private int position;
    public IteratorList2(List<Empleados> clientes){
        this.clientes=clientes;
        this.position=0;
    }
    @Override
    public Object next() {
        return clientes.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position<clientes.size() && clientes.size() != 0;
    }
}

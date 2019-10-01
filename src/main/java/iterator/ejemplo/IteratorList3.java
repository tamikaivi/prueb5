package iterator.ejemplo;

import java.util.HashMap;

public class IteratorList3 implements Iterator {

    private HashMap<Integer,Cliente> clientes;
    private int position;
    public IteratorList3(HashMap<Integer,Cliente> clientes){
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

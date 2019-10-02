package iterator.ejemplo;

import java.util.LinkedList;
import java.util.List;


public class BancoBList implements IList {

    private int position;
    List<Cliente> clientes;

    public BancoBList(){
        position=0;
        clientes = new LinkedList<>();
    }

    public void add (Cliente value){
        clientes.add(value);
    }

    @Override
    public IteratorList3 iterator() {
        return new IteratorList2(this.clientes);
    }
}

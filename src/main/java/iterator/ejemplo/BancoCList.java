package iterator.ejemplo;

import java.util.HashMap;


public class BancoCList implements IList {

    private int position;
    HashMap<Integer, Cliente> clientes;

    public BancoCList(){
        position=0;
        clientes = new HashMap<>();
    }

    public void add (Cliente value, Integer num){
        clientes.put(num, value);
    }

    @Override
    public IteratorList3 iterator() {
        return new IteratorList3(this.clientes);
    }
}

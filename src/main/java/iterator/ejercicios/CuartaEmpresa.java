package iterator.ejercicios;

import java.util.HashMap;


public class CuartaEmpresa implements IList {

    private int position;
    HashMap<Integer, Empleados> clientes;

    public CuartaEmpresa(){
        position=0;
        clientes = new HashMap<>();
    }

    public void add (Empleados value, Integer num){
        clientes.put(num, value);
    }

    @Override
    public IteratorList3 iterator() {
        return new IteratorList3(this.clientes);
    }
}

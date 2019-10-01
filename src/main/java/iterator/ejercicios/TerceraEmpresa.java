package iterator.ejercicios;

import java.util.HashMap;


public class TerceraEmpresa implements IList {

    private int position;
    HashMap<Integer, Empleados> clientes;

    public TerceraEmpresa(){
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

package iterator.ejercicios2;

import java.util.Vector;

public class IteratorList3 implements Iterator {

    private int position;
    Vector<Empleados> emple ;
    public IteratorList3(Vector<Empleados> clientes){
        this.emple=clientes;
        this.position=0;
    }
    @Override
    public Object next() {
        return emple.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position<emple.size() && emple.size() != 0;
    }
}

package iterator.ejercicios2;

import java.util.List;

public class IteratorList2 implements Iterator {

    private int position;
     Empleados [] empleados;

    public IteratorList2(Empleados[] clientes){
        this.empleados=clientes;
        this.position=0;
    }
    @Override
    public Object next() {
        return empleados[position++];
    }

    @Override
    public boolean hasNext() {
        return position<empleados.length && empleados.length != 0;
    }
}

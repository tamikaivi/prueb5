package iterator.ejercicios2;

import java.util.HashMap;
import java.util.Stack;

public class IteratorList4 implements Iterator {

    private int position;
    Stack<Empleados> pro;

    public IteratorList4(Stack<Empleados> clientes){
        this.pro=clientes;
        this.position=0;
    }
    @Override
    public Object next() {
        return pro.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position<pro.size() && pro.size() != 0;
    }
}

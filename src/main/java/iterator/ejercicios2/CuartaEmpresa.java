package iterator.ejercicios2;

import java.util.HashMap;
import java.util.Stack;


public class CuartaEmpresa implements IList {

    private int position;
    Stack<Empleados> pro;

    public CuartaEmpresa(){
        position=0;
        pro = new Stack<>();
    }

    public void add (Empleados value){
        pro.push(value);
    }

    @Override
    public IteratorList4 iterator() {
        return new IteratorList4(this.pro);
    }
}

package iterator.ejercicios2;

import iterator.ejemplo.IList;
import iterator.ejemplo.IteratorList3;

public class SegundaEmpresa implements IList {
    private int position;
    Empleados [] empleados;

    public SegundaEmpresa(){
        position=0;
        empleados = new Empleados[4];
    }
    public void add (Empleados value){
        empleados[position]=value;
        position++;
    }

    @Override
    public IteratorList2 iterator() {
        return new IteratorList2(this.empleados);
    }
}

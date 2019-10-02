package iterator.ejercicios2;

import java.util.LinkedList;
import java.util.List;

public class PrimeraEmpresa implements IList {
    private int position;
    List<Empleados> empleados;

    public PrimeraEmpresa(){
        position=0;
        empleados = new LinkedList<>();
    }
    public void add (Empleados value){
        empleados.add(value);
        position++;
    }

    @Override
    public IteradorList1 iterator() {
        return new IteradorList1(this.empleados);
    }
}

package iterator.ejercicios;

import java.util.List;

public class IteradorList1 implements Iterator {

    private int position;
    private List<Empleados> empleados;

    public  IteradorList1(List<Empleados> empleados){
        this.empleados = empleados;
        this.position = 0;
    }
    @Override
    public Object next() {
        return empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return  empleados.size() !=0 && position< empleados.size();
    }
}

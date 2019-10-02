package iterator.ejercicios2;

import java.util.Vector;


public class TerceraEmpresa implements IList {

    private int position;
    Vector<Empleados> emple ;

    public TerceraEmpresa(){
        position=0;
        emple = new Vector<>();
    }

    public void add (Empleados value, Integer num){
        emple.add(value);
    }

    @Override
    public IteratorList3 iterator() {
        return new IteratorList3(this.emple);
    }
}

package iterator.basic;

public class IteradorList1 implements Iterator {

    private int position;
    private String [] nombres;

    public  IteradorList1(String[] nombres){
        this.nombres = nombres;
    }
    @Override
    public Object next() {
        return nombres[position++];
    }

    @Override
    public boolean hasNext() {
        return nombres.length != 0 && position < nombres.length;
    }
}

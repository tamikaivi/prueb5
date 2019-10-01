package iterator.ejemplo;

public class IteradorList1 implements Iterator {

    private int position;
    private Cliente[] clientes;

    public  IteradorList1(Cliente[] clientes){
        this.clientes = clientes;
        this.position = 0;
    }
    @Override
    public Object next() {
        return clientes[position++];
    }

    @Override
    public boolean hasNext() {
        return  clientes.length !=0 && position< clientes.length ;
    }
}

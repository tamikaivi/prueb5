package iterator.ejemplo;

public class BancoAList implements IList {
    private int position;
    private Cliente [] clients;

    public BancoAList(){
        position=0;
        clients = new Cliente[1];
    }
    public void add (Cliente value){
        clients[position]=value;
        position++;
    }

    @Override
    public IteradorList1 iterator() {
        return new IteradorList1(this.clients);
    }
}

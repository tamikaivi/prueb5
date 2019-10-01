package Factory.ejemplo;

public class IE implements IBrowser {
    public IE(){

    }
    @Override
    public void create() {
        System.out.println("Creando IE");
    }
}

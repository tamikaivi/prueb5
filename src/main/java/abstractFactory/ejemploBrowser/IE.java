package abstractFactory.ejemploBrowser;

public class IE implements Browser {
    @Override
    public void create() {
        System.out.println("Creando IE");
    }
}

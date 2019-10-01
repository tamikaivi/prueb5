package abstractFactory.ejemploBrowser;

public class FireFox implements Browser {
    @Override
    public void create() {
        System.out.println("Creando FireFox");
    }
}

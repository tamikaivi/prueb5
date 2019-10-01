package abstractFactory.ejemploBrowser;

public class Chrome implements Browser {
    @Override
    public void create() {
        System.out.println("Creando Chrome");
    }
}

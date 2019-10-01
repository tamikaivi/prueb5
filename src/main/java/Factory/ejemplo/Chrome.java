package Factory.ejemplo;

public class Chrome implements IBrowser {
    public Chrome() {
    }

    @Override
    public void create() {
        System.out.println("Creando Chrome");
    }
}

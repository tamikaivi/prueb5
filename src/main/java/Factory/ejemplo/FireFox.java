package Factory.ejemplo;

public class FireFox implements IBrowser {
    public FireFox() {
    }

    @Override
    public void create() {
        System.out.println("Creando FireFox");
    }
}

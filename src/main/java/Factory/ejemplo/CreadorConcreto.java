package Factory.ejemplo;

public class CreadorConcreto extends Creador {
    @Override
    public IE factoryMethodProduct() {

        IE base1 = new IE();
        return base1;
    }
}

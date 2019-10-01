package Factory.ejemplo;

import Factory.basic.ProductoConcreto;

public class CreadorConcreto3 extends Creador {
    @Override
    public FireFox factoryMethodProduct() {
        ProductoConcreto productoConcreto = new ProductoConcreto();
        FireFox base1 = new FireFox();
        return base1;
    }
}

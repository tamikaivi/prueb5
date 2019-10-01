package Factory.ejemplo;

import Factory.basic.ProductoConcreto;

public class CreadorConcreto2 extends Creador {
    @Override
    public Chrome factoryMethodProduct() {
        ProductoConcreto productoConcreto = new ProductoConcreto();
        Chrome base1 = new Chrome();
        return base1;
    }
}

package Factory.basic;

public class CreadorConcreto2 extends Creador {
    @Override
    public ProductoConcreto2 factoryMethodProduct() {
        ProductoConcreto2 productoConcreto = new ProductoConcreto2();
        Base3 base3 = new Base3();
        Base4 base4 = new Base4();
        productoConcreto.setBase3(base3);
        productoConcreto.setBase4(base4);
        return productoConcreto;
    }
}

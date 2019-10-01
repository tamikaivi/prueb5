package Factory.basic;

public class CreadorConcreto extends Creador {
    @Override
    public ProductoConcreto factoryMethodProduct() {
        ProductoConcreto productoConcreto = new ProductoConcreto();
        Base1 base1 = new Base1();
        Base2 base2 = new Base2();
        productoConcreto.setBase1(base1);
        productoConcreto.setBase2(base2);
        return productoConcreto;
    }
}

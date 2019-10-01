package abstractFactory.BASIC;

public class FactoryProduct {
    enum numType{
        PRODUCT1,
        PRODUCT2
    }
    public static Product make(numType type){

        Product product;
        switch (type){
            case PRODUCT1:
                product = new ProductoConcreto1();
                break;
            case PRODUCT2:
                product = new ProductoConcreto2();
                break;
                default:
                    product = new ProductoConcreto2();
                    break;
        }
        return product;
    }
}

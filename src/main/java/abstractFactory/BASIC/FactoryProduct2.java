package abstractFactory.BASIC;

public class FactoryProduct2 {
    public static IProduct make(String type){
        IProduct product;
        switch (type){
            case "product3":
                product = new ProductoConcreto3();
                break;
            case "product4":
                product = new ProductoConcreto4();
                break;
            default:
                product = new ProductoConcreto4();
                break;
        }
        return product;
    }
}

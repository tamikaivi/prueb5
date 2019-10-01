package abstractFactory.BASIC;

public class Cliente {
        public static void main(String []args){

            FactoryProduct.make(FactoryProduct.numType.PRODUCT1).operation();
            FactoryProduct2.make("product3").operation();
        }
}

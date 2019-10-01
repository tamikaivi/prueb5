package Factory.basic;

public class Cliente {
        public static void main(String []args){
            ProductoConcreto pro  = new CreadorConcreto().factoryMethodProduct();
        }
}

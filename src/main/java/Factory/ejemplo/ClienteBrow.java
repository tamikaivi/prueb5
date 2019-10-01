package Factory.ejemplo;

public class ClienteBrow {
    public static void main(String []args){

        IE pro =  new CreadorConcreto().factoryMethodProduct();
        pro.create();
        Chrome proC = new CreadorConcreto2().factoryMethodProduct();
        proC.create();
        FireFox prop = new CreadorConcreto3().factoryMethodProduct();
        prop.create();

    }
}

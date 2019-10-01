package Factory.ejercicios;

public class Cliente {
        public static void main(String []args) {
            KitEscolar kitEscolar  = new CreadorConcreto().factoryMethodKit();
            kitEscolar.create();
            KitColegial kitColegial = new CreadorConcreto2().factoryMethodKit();
            kitColegial.create();
        }
}

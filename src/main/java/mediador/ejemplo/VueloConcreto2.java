package mediador.ejemplo;

public class VueloConcreto2 extends Vuelo {
    public VueloConcreto2(ITorre mediator){
        super(mediator);
    }

    @Override
    public void send(String msg, Vuelo vuelo) {
        mediator.send(msg, this,vuelo);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println(" Colleague 2 recibe message : "+msg);
    }
}

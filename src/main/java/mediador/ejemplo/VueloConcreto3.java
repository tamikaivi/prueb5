package mediador.ejemplo;

public class VueloConcreto3 extends Vuelo {
    public VueloConcreto3(ITorre mediator){
        super(mediator);
    }

    @Override
    public void send(String msg, Vuelo vuelo) {
        mediator.send(msg, this, vuelo);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println(" Colleague 3 recibe message : "+msg);
    }
}

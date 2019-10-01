package mediador.ejemplo;

public class VueloConcreto4 extends Vuelo {
    public VueloConcreto4(ITorre mediator){
        super(mediator);
    }

    @Override
    public void send(String msg, Vuelo vuelo) {
        mediator.send(msg, this,vuelo);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println(" Colleague 4 recibe message : "+msg);
    }
}

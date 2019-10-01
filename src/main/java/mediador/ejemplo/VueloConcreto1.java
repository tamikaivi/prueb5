package mediador.ejemplo;

public class VueloConcreto1 extends Vuelo {
    public VueloConcreto1(ITorre mediator){
        super(mediator);
    }



    @Override
    public void send(String msg, Vuelo receptor) {
        mediator.send(msg, this, receptor );
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println(" Colleague 1 recibe message : "+msg);
    }
}

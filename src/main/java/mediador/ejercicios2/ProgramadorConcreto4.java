package mediador.ejercicios2;

public class ProgramadorConcreto4 extends Programadores {
    public ProgramadorConcreto4(ISala mediator){
        super(mediator);
    }



    @Override
    public void send(String msg, Programadores receptor) {
        mediator.send(msg, receptor );
    }

    @Override
    public void sendTodos(String msg) {

        mediator.sendTodos(msg, this);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println("Programador 4 recive mensaje: "+msg);
    }


}

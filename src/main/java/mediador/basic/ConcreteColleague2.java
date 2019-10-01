package mediador.basic;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println(" Colleague 2 recibe message : "+msg);
    }
}

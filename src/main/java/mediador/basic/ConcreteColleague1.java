package mediador.basic;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg, this);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println(" Colleague 1 recibe message : "+msg);
    }
}

package mediador.basic;

public class ConcreateMediator implements Mediator {

    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;

    public void setColleage1 (ConcreteColleague1 colleage1){user1=colleage1;}

    public void setColleage2 (ConcreteColleague2 colleage2){
        user2=colleage2;
    }
    @Override
    public void send(String msg, Colleague colleage) {
        if(colleage==user1){
            user2.messageRecived(msg);
        }else {
            user1.messageRecived(msg);
        }

    }
}

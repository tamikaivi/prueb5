package mediador.basic;

public class Cient {
    public static void main (String []ags){
        ConcreateMediator mediator=new ConcreateMediator();

        ConcreteColleague1 colleague1 =  new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleage1(colleague1);
        mediator.setColleage2(colleague2);

        colleague1.send("mensaje 1 - pregunta" );
        colleague2.send("mesaje 2 - respuesta");
    }
}

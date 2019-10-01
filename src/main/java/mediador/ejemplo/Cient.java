package mediador.ejemplo;

public class Cient {
    public static void main (String []ags){
        TorreGeneral mediator=new TorreGeneral();

        VueloConcreto1 colleague1 =  new VueloConcreto1(mediator);
        VueloConcreto2 colleague2 = new VueloConcreto2(mediator);
        VueloConcreto3 colleague3 = new VueloConcreto3(mediator);
        VueloConcreto4 colleague4 = new VueloConcreto4(mediator);

        mediator.addVuelo(1,colleague1);
        mediator.addVuelo(2, colleague2);
        mediator.addVuelo(3, colleague3);
        mediator.addVuelo(4, colleague4);


        colleague1.send("mensaje 1 - pregunta", mediator.getVuelo(2));
        colleague2.send("mesaje 2 - respuesta",mediator.getVuelo(3) );
        colleague3.send("mesaje 2 - respuesta",mediator.getVuelo(4) );
    }
}

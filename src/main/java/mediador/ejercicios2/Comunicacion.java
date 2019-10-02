package mediador.ejercicios2;

public class Comunicacion {
    public static void main (String []ags){
        SalaGeneral mediator=new SalaGeneral();


        ProgramadorConcreto1 programadorConcreto1 =new ProgramadorConcreto1(mediator);
        ProgramadorConcreto2 programadorConcreto2 = new ProgramadorConcreto2(mediator);
        ProgramadorConcreto3 programadorConcreto3 = new ProgramadorConcreto3(mediator);
        ProgramadorConcreto4 programadorConcreto4 = new ProgramadorConcreto4(mediator);


        mediator.addProgramador(1, programadorConcreto1);
        mediator.addProgramador(2, programadorConcreto2);
        mediator.addProgramador(3, programadorConcreto3);
        mediator.addProgramador(4, programadorConcreto4);

        programadorConcreto1.sendTodos("Estoy haciendo la tarea 7 del Backlog");

        programadorConcreto1.send("Estoy modificando el codigo B", mediator.getProgramador(2));
      programadorConcreto2.send("Estoy modificando el codigo C", mediator.getProgramador(3));

        programadorConcreto1.sendTodos("Estoy modificando el log in del codigo");
       // int porgramadores=5;
       // for (int n = 0; n<porgramadores; n++){
       //     ProgramadorConcreto1 prog1 =  new ProgramadorConcreto1(mediator);
       //     mediator.addProgramador(n,prog1);

       // }

        /*mediator.getProgramador(1).send("mensaje 1 - Quiero cambiar codigo", mediator.getProgramador(2));
        mediator.getProgramador(2).send("mesaje 2 - ok",mediator.getProgramador(1) );
        mediator.getProgramador(3).send("mesaje 3 - Quiero tomar la tarea 2 del backlog",mediator.getProgramador(4) );
        mediator.getProgramador(4).send("mesaje 4 - ok",mediator.getProgramador(3) );
*/

        //mediator.getProgramador(2).sendTodos("mesaje para todos cambio de codigo");

    }
}

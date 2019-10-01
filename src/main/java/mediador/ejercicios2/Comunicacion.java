package mediador.ejercicios2;

public class Comunicacion {
    public static void main (String []ags){
        SalaGeneral mediator=new SalaGeneral();

        int porgramadores=5;
        for (int n = 0; n<porgramadores; n++){
            ProgramadorConcreto1 prog1 =  new ProgramadorConcreto1(mediator);
            mediator.addProgramador(n,prog1);

        }

        /*mediator.getProgramador(1).send("mensaje 1 - Quiero cambiar codigo", mediator.getProgramador(2));
        mediator.getProgramador(2).send("mesaje 2 - ok",mediator.getProgramador(1) );
        mediator.getProgramador(3).send("mesaje 3 - Quiero tomar la tarea 2 del backlog",mediator.getProgramador(4) );
        mediator.getProgramador(4).send("mesaje 4 - ok",mediator.getProgramador(3) );
*/

        mediator.getProgramador(2).sendTodos("mesaje para todos cambio de codigo");

    }
}

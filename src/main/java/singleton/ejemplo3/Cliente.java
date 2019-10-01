package singleton.ejemplo3;

public class Cliente {
    public static void main (String [] args){
        Persona persona1 = new Persona("Persona1");
        persona1.getTimePersona();

        Persona persona2 = new Persona("Persona2");
        persona2.getTimePersona();
        Persona persona3 = new Persona("Persona3");
        persona3.getTimePersona();
        Persona persona4 = new Persona("Persona4");
        persona4.getTimePersona();
        Persona persona5 = new Persona("Persona5");
        persona5.getTimePersona();
    }
}

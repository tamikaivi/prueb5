package Interpreter.ejercicios2;

public class Client {
    public static void main(String [] args){
        String toInterpretate = "Como [usuario] Quiero [accciones] Para [valor de la story]";
        System.out.println("Evaluate : "+toInterpretate+"\n Interpretate: "+ new Parser(toInterpretate).evaluate());
    }
}

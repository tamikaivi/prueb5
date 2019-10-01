package Interpreter.ejemplo;

public class Client {
    public static void main(String [] args){
        String toInterpretate = "X";
        System.out.println("Evaluate : "+toInterpretate+"\n Interpretate: "+ new Parser(toInterpretate).evaluate());
    }
}

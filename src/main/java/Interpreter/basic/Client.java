package Interpreter.basic;

public class Client {
    public static void main(String [] args){
        String toInterpretate = "A E I O U U U u u u *";
        System.out.println("Evaluate : "+toInterpretate+"\n Interpretate: "+ new Parser(toInterpretate).evaluate());
    }
}

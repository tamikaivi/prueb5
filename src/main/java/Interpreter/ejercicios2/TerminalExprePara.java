package Interpreter.ejercicios2;

public class TerminalExprePara extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output += "Then";
            context.input = context.input.substring(4);
        }
    }
}

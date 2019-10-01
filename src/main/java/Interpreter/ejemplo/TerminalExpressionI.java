package Interpreter.ejemplo;

public class TerminalExpressionI extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("I")){
            context.output = context.output+1;
            context.input = context.input.substring(1);
        }
    }
}

package Interpreter.ejemplo;

public class TerminalExpressionV extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("V")){
            context.output = context.output+5;
            context.input = context.input.substring(1);

        }
    }
}

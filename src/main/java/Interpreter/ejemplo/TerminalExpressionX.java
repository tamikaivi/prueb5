package Interpreter.ejemplo;

public class TerminalExpressionX extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("X")){
            context.output = context.output+10;
            context.input = context.input.substring(1);

        }
    }
}

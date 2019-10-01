package Interpreter.basic;

public class TerminalExpressionAs extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.output = context.output+"10";
            context.input = context.input.substring(1);
        }
    }
}

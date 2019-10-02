package Interpreter.ejercicios2;

public class TerminalExpreQuiero extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output += "When";
            context.input = context.input.substring(6);
        }
    }
}

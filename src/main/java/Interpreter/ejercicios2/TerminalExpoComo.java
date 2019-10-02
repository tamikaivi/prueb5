package Interpreter.ejercicios2;

public class TerminalExpoComo extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output += "Given";
            context.input = context.input.substring(4);
        }
    }
}

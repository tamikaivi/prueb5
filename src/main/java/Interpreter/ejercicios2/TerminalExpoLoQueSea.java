package Interpreter.ejercicios2;

import iterator.ejercicios2.SegundaEmpresa;

public class TerminalExpoLoQueSea extends AbstractExpresion {

    private String loquesea;
    public  TerminalExpoLoQueSea(String loquesea){
        this.loquesea = loquesea;
    }

    @Override
    public void interpreter(Context context) {

            context.output += loquesea;
            context.input = context.input.substring(loquesea.length());

    }
}

package Interpreter.ejercicios2;

import java.util.ArrayList;

public class Parser {
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<>();
    private Context context;

    public Parser(String s){
        s = s.toUpperCase();
            context = new Context(s.replace(" ", ""));
            System.out.println(context);
            for (String token : s.split(" ")){
                switch (token){
                    case "Como":
                        parseTree.add(new TerminalExpoComo());
                        break;
                    case "Quiero":
                        parseTree.add(new TerminalExpreQuiero());
                        break;
                    case "Para":
                        parseTree.add(new TerminalExprePara());
                        break;
                    default:
                        break;
                }


            }



    }
    public String evaluate(){

        for (AbstractExpresion e : parseTree){
            e.interpreter(context);
        }
        return context.output;
    }
}

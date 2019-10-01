package Interpreter.ejemplo;

import java.util.ArrayList;

public class Parser {
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<>();
    private Context context;

    public Parser(String s){
        s = s.toUpperCase();

        if (s.equals("I V")){
            context = new Context(s);
            parseTree.add(new TerminalExpressionIV());
        }else if (s.equals("I X")) {
            context = new Context(s);
            parseTree.add(new TerminalExpressionIX());
        }else{
            context = new Context(s.replace(" ", ""));
            System.out.println(context);
            for (String token : s.split(" ")){
                switch (token){
                    case "I":
                        parseTree.add(new TerminalExpressionI());
                        break;
                    case "V":
                        parseTree.add(new TerminalExpressionV());
                        break;
                    case "X":
                        parseTree.add(new TerminalExpressionX());
                        break;
                    default:
                        break;
                }


            }
        }


    }
    public int evaluate(){

        for (AbstractExpresion e : parseTree){
            e.interpreter(context);
        }
        return context.output;
    }
}

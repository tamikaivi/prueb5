package builder.ejercicios;

public class Estudiante {
    public static void main(String [] args){
        Cocinero cocinero = new Cocinero();
        BuilderPizza pizzaHawuaiana = new PizzaHawuaiana();
        cocinero.setBuilderPizza(pizzaHawuaiana);
        cocinero.buildPizza();
        Pizza pizza = cocinero.getPizza();

        BuilderPizza pizzaCarnivora = new PizzaCarnivora();
        cocinero.setBuilderPizza(pizzaCarnivora);
        cocinero.buildPizza();
        Pizza pizza2 = cocinero.getPizza();


    }

}

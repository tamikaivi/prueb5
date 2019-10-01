package builder.ejercicios;

public class Cocinero {
    private BuilderPizza builderPizza;

    public void setBuilderPizza(BuilderPizza builderPizza) {
        this.builderPizza = builderPizza;
    }
    public Pizza getPizza() {
        return builderPizza.getPizza();
    }


    public void buildPizza(){
        builderPizza.pedirPizza();
        builderPizza.masa();
        builderPizza.salsa();
        builderPizza.tipoQueso();
    }
}

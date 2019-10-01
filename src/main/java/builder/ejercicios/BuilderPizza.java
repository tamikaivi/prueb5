package builder.ejercicios;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }
    public  void pedirPizza(){
        pizza =new Pizza();
    }

    public abstract void masa();
    public abstract void salsa();
    public abstract void tipoQueso();
}

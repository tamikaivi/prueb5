package builder.ejercicios;

public class PizzaHawuaiana extends BuilderPizza {

    @Override
    public void masa() {
        pizza.setMasa("suabe");
    }

    @Override
    public void salsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void tipoQueso() {
        pizza.setTipoQueso("blanco");
    }
}

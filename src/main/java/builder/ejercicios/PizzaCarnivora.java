package builder.ejercicios;

public class PizzaCarnivora extends BuilderPizza {
    @Override
    public void masa() {
        pizza.setMasa("suave");
    }

    @Override
    public void salsa() {
        pizza.setSalsa("roja");
    }

    @Override
    public void tipoQueso() {
        pizza.setTipoQueso("duro");
    }
}

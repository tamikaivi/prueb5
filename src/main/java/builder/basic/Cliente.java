package builder.basic;

public class Cliente {
    public static void main(String [] args){
        Director d = new Director();
        ProductBuilder productConcreteBuilder = new ProductConcreteBuilder();
        d.setProductBuilder(productConcreteBuilder);
        d.buildProduct();
        Producto producto = d.getProduct();


    }

}

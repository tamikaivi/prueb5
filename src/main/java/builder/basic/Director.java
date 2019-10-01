package builder.basic;

public class Director {
    private ProductBuilder productBuilder;

    public void setProductBuilder(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }
    public Producto getProduct() {
        return productBuilder.getProducto();
    }


    public void buildProduct(){
        productBuilder.createProduct();
        productBuilder.buildAttribute1();
        productBuilder.buildAttribute2();
        productBuilder.buildAttribute3();
    }
}

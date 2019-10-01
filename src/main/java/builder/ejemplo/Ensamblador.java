package builder.ejemplo;

public class Ensamblador {
    private BuilderComputadora builderComputadora;

    public void setProductBuilder(BuilderComputadora builderComputadora) {
        this.builderComputadora = builderComputadora;
    }
    public Computadora getProduct() {
        return builderComputadora.getComputadora();
    }


    public void buildComputadora(){
        builderComputadora.createComputadora();
        builderComputadora.procesador();
        builderComputadora.memory();
        builderComputadora.targetaVideo();
    }
}

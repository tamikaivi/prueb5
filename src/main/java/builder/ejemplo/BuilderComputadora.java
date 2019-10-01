package builder.ejemplo;

public abstract class BuilderComputadora {
    protected Computadora computadora;

    public Computadora getComputadora(){
        return computadora;
    }
    public  void createComputadora (){
        computadora =new Computadora();
    }

    public abstract void procesador();
    public abstract void memory();
    public abstract void targetaVideo();
}

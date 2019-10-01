package builder.ejemplo;

public class ComputadoraI7 extends BuilderComputadora {
    @Override
    public void procesador() {
        computadora.setProcesador("I7");
    }

    @Override
    public void memory() {
        computadora.setMemory("32GB");
    }

    @Override
    public void targetaVideo() {
        computadora.setTargetaVideo("8GB");
    }
}

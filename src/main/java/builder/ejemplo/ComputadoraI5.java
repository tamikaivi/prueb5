package builder.ejemplo;

public class ComputadoraI5 extends BuilderComputadora {
    @Override
    public void procesador() {
        computadora.setProcesador("I5");
    }

    @Override
    public void memory() {
        computadora.setMemory("16GB");
    }

    @Override
    public void targetaVideo() {
        computadora.setTargetaVideo("6GB");
    }
}

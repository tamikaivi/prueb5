package builder.ejemplo;

public class ComputadoraI3 extends BuilderComputadora {

    @Override
    public void procesador() {
        computadora.setProcesador("I3");
    }

    @Override
    public void memory() {
        computadora.setMemory("8GB");
    }

    @Override
    public void targetaVideo() {
        computadora.setTargetaVideo("4GB");
    }
}

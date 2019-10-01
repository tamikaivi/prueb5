package builder.ejemplo;

public class Computadora {
    private String procesador="";
    private String memory="";
    private String targetaVideo="";

    public String getTargetaVideo() {
        return targetaVideo;
    }

    public void setTargetaVideo(String targetaVideo) {
        this.targetaVideo = targetaVideo;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}

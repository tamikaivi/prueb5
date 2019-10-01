package basic.ejemplo;

public class Guerrero implements IPersonaje {
    private int velocidad;
    private int danio;
    private String arma;
    private String armadura;
    private int nivel;

    public Guerrero(){

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public Object clone() {
        Guerrero gerr = new Guerrero();
        gerr.setArma(this.arma);
        gerr.setArmadura(this.armadura);
        gerr.setDanio(this.danio);
        gerr.setNivel(this.nivel);
        gerr.setVelocidad(this.velocidad);

        return gerr;
    }
}

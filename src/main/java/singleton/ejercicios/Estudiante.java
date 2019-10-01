package singleton.ejercicios;

public class Estudiante {

    private String nombre;
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public int getConsultar(){

        return Ventanilla.getInstance().getConsultar();
    }
}

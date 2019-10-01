package basic.ejercicios;

public class Docente implements IContrato {
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraDeEntrada;
    private String marcadoHoraDeSalida;
    private String nombre;
    private String apellido;

    public Docente(){

    }

    public boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraDeEntrada() {
        return marcadoHoraDeEntrada;
    }

    public void setMarcadoHoraDeEntrada(String marcadoHoraDeEntrada) {
        this.marcadoHoraDeEntrada = marcadoHoraDeEntrada;
    }

    public String getMarcadoHoraDeSalida() {
        return marcadoHoraDeSalida;
    }

    public void setMarcadoHoraDeSalida(String marcadoHoraDeSalida) {
        this.marcadoHoraDeSalida = marcadoHoraDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public boolean getCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public Object clone() {
        Docente docente = new Docente();
        docente.setNombre(this.nombre);
        docente.setApellido(this.apellido);
        docente.setSueldo(this.sueldo);
        docente.setCargaHoraria(this.cargaHoraria);
        docente.setCursoEducacionSuperior(cursoEducacionSuperior);
        docente.setAccesoPlataforma(this.accesoPlataforma);
        docente.setMarcadoBiometrico(this.marcadoBiometrico);
        docente.setMarcadoHoraDeEntrada(this.marcadoHoraDeEntrada);
        docente.setMarcadoHoraDeSalida(this.marcadoHoraDeSalida);

        return docente;
    }
}

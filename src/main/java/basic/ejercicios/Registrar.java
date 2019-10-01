package basic.ejercicios;


public class Registrar {
    public static void main (String [] args) {

        Docente docente1 = new Docente();

        docente1.setNombre("Sergio");
        docente1.setApellido("Torrico");
        docente1.setSueldo(5000);
        docente1.setCargaHoraria(80);
        docente1.setCursoEducacionSuperior(true);
        docente1.setAccesoPlataforma(true);
        docente1.setMarcadoBiometrico(false);
        docente1.setMarcadoHoraDeEntrada("08:00");
        docente1.setMarcadoHoraDeSalida("18:00");


        System.out.println("value docente1 nombre "+docente1.getNombre());
        System.out.println("value docente1 apellido "+docente1.getApellido());
        System.out.println("value docente1 Sueldo "+docente1.getSueldo());
        System.out.println("value docente1 CargaHoraria "+docente1.getCargaHoraria());
        System.out.println("value docente1 CursoEducacionSuperior "+docente1.getCursoEducacionSuperior());
        System.out.println("value docente1 AccesoPlataforma "+docente1.getAccesoPlataforma());
        System.out.println("value docente1 MarcadoBiometrico "+docente1.getMarcadoBiometrico());
        System.out.println("value docente1 MarcadoHoraDeEntrada "+docente1.getMarcadoHoraDeEntrada());
        System.out.println("value docente1 MarcadoHoraDeSalida "+docente1.getMarcadoHoraDeSalida());
        Docente docente2 = (Docente) docente1.clone();
        docente2.setNombre("Vivian");
        docente2.setApellido("Loza");

        System.out.println("value docente2 nombre "+docente2.getNombre());
        System.out.println("value docente2 apellido "+docente2.getApellido());
        System.out.println("value docente2 Sueldo "+docente2.getSueldo());
        System.out.println("value docente2 CargaHoraria "+docente2.getCargaHoraria());
        System.out.println("value docente2 CursoEducacionSuperior "+docente2.getCursoEducacionSuperior());
        System.out.println("value docente2 AccesoPlataforma "+docente2.getAccesoPlataforma());
        System.out.println("value docente2 MarcadoBiometrico "+docente2.getMarcadoBiometrico());
        System.out.println("value docente2 MarcadoHoraDeEntrada "+docente2.getMarcadoHoraDeEntrada());
        System.out.println("value docente2 MarcadoHoraDeSalida "+docente2.getMarcadoHoraDeSalida());


        Docente docente3 = (Docente) docente1.clone();
        docente3.setNombre("Camila");
        docente3.setApellido("Loayza");

        System.out.println("value docente3 nombre "+docente3.getNombre());
        System.out.println("value docente3 apellido "+docente3.getApellido());
        System.out.println("value docente3 Sueldo "+docente3.getSueldo());
        System.out.println("value docente3 CargaHoraria "+docente3.getCargaHoraria());
        System.out.println("value docente3 CursoEducacionSuperior "+docente3.getCursoEducacionSuperior());
        System.out.println("value docente3 AccesoPlataforma "+docente3.getAccesoPlataforma());
        System.out.println("value docente3 MarcadoBiometrico "+docente3.getMarcadoBiometrico());
        System.out.println("value docente3 MarcadoHoraDeEntrada "+docente3.getMarcadoHoraDeEntrada());
        System.out.println("value docente3 MarcadoHoraDeSalida "+docente3.getMarcadoHoraDeSalida());



        Docente docente4 = (Docente) docente1.clone();
        docente4.setNombre("Kevin");
        docente4.setApellido("Cardenas");

        System.out.println("value docente4 nombre "+docente4.getNombre());
        System.out.println("value docente4 apellido "+docente4.getApellido());
        System.out.println("value docente4 Sueldo "+docente4.getSueldo());
        System.out.println("value docente4 CargaHoraria "+docente4.getCargaHoraria());
        System.out.println("value docente4 CursoEducacionSuperior "+docente4.getCursoEducacionSuperior());
        System.out.println("value docente4 AccesoPlataforma "+docente4.getAccesoPlataforma());
        System.out.println("value docente4 MarcadoBiometrico "+docente4.getMarcadoBiometrico());
        System.out.println("value docente4 MarcadoHoraDeEntrada "+docente4.getMarcadoHoraDeEntrada());
        System.out.println("value docente4 MarcadoHoraDeSalida "+docente4.getMarcadoHoraDeSalida());



        Docente docente5 = (Docente) docente1.clone();
        docente5.setNombre("Kevin");
        docente5.setApellido("Pomier");

        System.out.println("value docente5 nombre "+docente5.getNombre());
        System.out.println("value docente5 apellido "+docente5.getApellido());
        System.out.println("value docente5 Sueldo "+docente5.getSueldo());
        System.out.println("value docente5 CargaHoraria "+docente5.getCargaHoraria());
        System.out.println("value docente5 CursoEducacionSuperior "+docente5.getCursoEducacionSuperior());
        System.out.println("value docente5 AccesoPlataforma "+docente5.getAccesoPlataforma());
        System.out.println("value docente5 MarcadoBiometrico "+docente5.getMarcadoBiometrico());
        System.out.println("value docente5 MarcadoHoraDeEntrada "+docente5.getMarcadoHoraDeEntrada());
        System.out.println("value docente5 MarcadoHoraDeSalida "+docente2.getMarcadoHoraDeSalida());

        Docente docente6 = (Docente) docente1.clone();
        docente6.setNombre("Profesor 6");
        docente6.setApellido("Apellido 6");

        Docente docente7 = (Docente) docente1.clone();
        docente7.setNombre("Profesor 7");
        docente7.setApellido("Apellido 7");

        Docente docente8 = (Docente) docente1.clone();
        docente8.setNombre("Profesor 8");
        docente8.setApellido("Apellido 8");


        Docente docente9 = (Docente) docente1.clone();
        docente9.setNombre("Profesor 9");
        docente9.setApellido("Apellido 9");

        Docente docente10 = (Docente) docente1.clone();
        docente10.setNombre("Profesor 10");
        docente10.setApellido("Apellido 10");


        Docente docente11 = (Docente) docente1.clone();
        docente11.setNombre("Profesor 11");
        docente11.setApellido("Apellido 11");


        Docente docente12 = (Docente) docente1.clone();
        docente12.setNombre("Profesor 12");
        docente12.setApellido("Apellido 12");

        Docente docente13 = (Docente) docente1.clone();
        docente13.setNombre("Profesor 13");
        docente13.setApellido("Apellido 13");

        Docente docente14 = (Docente) docente1.clone();
        docente14.setNombre("Profesor 14");
        docente14.setApellido("Apellido 14");


        Docente docente15 = (Docente) docente1.clone();
        docente15.setNombre("Profesor 15");
        docente15.setApellido("Apellido 15");

    }
}

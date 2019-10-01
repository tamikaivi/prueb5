package abstractFactory.ejercicios;

public class Estudiante {
    public static void main(String []args){

        FactoryMaterias.make(FactoryMaterias.browType.HISTORIA).incribir();
        FactoryMaterias.make(FactoryMaterias.browType.MATEMATICA).incribir();
        FactoryMaterias.make(FactoryMaterias.browType.INGLES).incribir();
        FactoryMaterias.make(FactoryMaterias.browType.LENGUAJE).incribir();
        FactoryMaterias.make(FactoryMaterias.browType.MATEMATICA).incribir();
    }
}

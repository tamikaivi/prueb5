package abstractFactory.ejercicios;

public class FactoryMaterias {
    enum browType{
        MATEMATICA,
        LENGUAJE,
        HISTORIA,
        INGLES
    }
    public static IMaterias make(browType type){

        IMaterias product;
        switch (type){
            case MATEMATICA:
                product = new Matematicas();
                break;
            case LENGUAJE:
                product = new Historia();
                break;
            case HISTORIA:
                product = new Lenguaje();
                break;
            case INGLES:
                product = new Ingles();
                break;
            default:
                product = new Matematicas();
                break;
        }
        return product;
    }
}

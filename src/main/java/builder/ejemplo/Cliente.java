package builder.ejemplo;

public class Cliente {
    public static void main(String [] args){
        Ensamblador en = new Ensamblador();
        BuilderComputadora computadoraI3 = new ComputadoraI3();
        en.setProductBuilder(computadoraI3);
        en.buildComputadora();
        Computadora computadora = en.getProduct();

        BuilderComputadora computadoraI5 = new ComputadoraI3();
        en.setProductBuilder(computadoraI5);
        en.buildComputadora();
        Computadora computadora2 = en.getProduct();

        BuilderComputadora computadoraI7 = new ComputadoraI3();
        en.setProductBuilder(computadoraI7);
        en.buildComputadora();
        Computadora computadora3 = en.getProduct();

    }

}

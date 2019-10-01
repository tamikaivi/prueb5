package basic.ejemplo;


public class Cliente {
    public static void main (String [] args) {

        Guerrero guer1 = new Guerrero();
        guer1.setDanio(1);
        guer1.setVelocidad(5);
        guer1.setNivel(30);
        guer1.setArmadura("caprazon");
        guer1.setArma("Espada");


        System.out.println("value obj2 arma "+guer1.getArma());
        System.out.println("value obj2 armadura "+guer1.getArmadura());
        System.out.println("value obj2 danio "+guer1.getDanio());
        System.out.println("value obj2 nivel "+guer1.getNivel());
        System.out.println("value obj2 velocidad "+guer1.getVelocidad());
        Guerrero guer2 = (Guerrero) guer1.clone();
        guer2.setDanio(3);
        System.out.println("value obj3 "+guer2.getArma());
        System.out.println("value obj3 "+guer2.getArmadura());
        System.out.println("value obj3 "+guer2.getDanio());
        System.out.println("value obj3 "+guer2.getNivel());
        System.out.println("value obj3 "+guer2.getVelocidad());
        Guerrero guer3 = (Guerrero) guer1.clone();
        guer3.setDanio(4);
        System.out.println("value obj4 "+guer3.getArma());
        System.out.println("value obj4 "+guer3.getArmadura());
        System.out.println("value obj4 "+guer3.getDanio());
        System.out.println("value obj4 "+guer3.getNivel());
        System.out.println("value obj4 "+guer3.getVelocidad());
        Guerrero guer4 = (Guerrero) guer1.clone();
        guer4.setDanio(5);
        System.out.println("value obj5 "+guer4.getArma());
        System.out.println("value obj5 "+guer4.getArmadura());
        System.out.println("value obj5 "+guer4.getDanio());
        System.out.println("value obj5 "+guer4.getNivel());
        System.out.println("value obj5 "+guer4.getVelocidad());
    }
}

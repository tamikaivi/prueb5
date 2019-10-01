package iterator.basic;

public class Client {
    public static void main(String [] args){
        List1 listatype1 = new List1();
        listatype1.add("B1 nombre e1");
        listatype1.add("B1 nombre e2");
        listatype1.add("B1 nombre e3");
        listatype1.add("B1 nombre e4");


        List2 listaType2 = new List2();
        listaType2.add("B2 nombre e1");
        listaType2.add("B2 nombre e2");
        listaType2.add("B2 nombre e3");
        listaType2.add("B2 nombre e4");


        Iterator iterator;
        iterator = listatype1.iterator();

        while (iterator.hasNext()){
            String nombre = (String) iterator.next();
            System.out.println("nombre : "+nombre);
        }

        iterator = listaType2.iterator();

        while (iterator.hasNext()){
            String nombre = (String) iterator.next();
            System.out.println("nombre : "+nombre);
        }




    }
}

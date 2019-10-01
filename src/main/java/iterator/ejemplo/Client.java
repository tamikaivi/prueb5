package iterator.ejemplo;

public class Client {
    public static void main(String [] args){
        BancoAList listatype1 = new BancoAList();
        Cliente cliente = new Cliente("Kevin", "Por ahi");
        listatype1.add(cliente);


        BancoBList listaType2 = new BancoBList();
        Cliente cliente2 = new Cliente("Sergio ", "Tumusla");
        listaType2.add(cliente2);

        BancoCList listaType3 = new BancoCList();
        Cliente cliente4 = new Cliente("Sergio Ramirez", "Tumusla");
        listaType3.add(cliente4, 0);



        Iterator iterator;
        iterator = listatype1.iterator();

        while (iterator.hasNext()){
            cliente = (Cliente) iterator.next();
            System.out.println("nombre : "+cliente.getNombre());
            System.out.println("direccion : "+cliente.getDireccion());
        }


        iterator = listaType2.iterator();

        while (iterator.hasNext()){
            cliente2 = (Cliente) iterator.next();
            System.out.println("nombre : "+cliente2.getNombre());
            System.out.println("direccion : "+cliente2.getDireccion());
        }


        iterator = listaType3.iterator();

        while (iterator.hasNext()){
            cliente4 = (Cliente) iterator.next();
            System.out.println("nombre : "+cliente4.getNombre());
            System.out.println("direccion : "+cliente4.getDireccion());
        }

    }
}

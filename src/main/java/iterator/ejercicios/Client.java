package iterator.ejercicios;

public class Client {
    public static void main(String [] args){
        PrimeraEmpresa listatype1 = new PrimeraEmpresa();
        Empleados cliente = new Empleados("Kevin", "Por ahi");
        listatype1.add(cliente);


        SegundaEmpresa listaType2 = new SegundaEmpresa();
        Empleados cliente2 = new Empleados("Sergio ", "Tumusla");
        listaType2.add(cliente2);

        TerceraEmpresa listaType3 = new TerceraEmpresa();
        Empleados cliente4 = new Empleados("Sergio Ramirez", "Tumusla");
        listaType3.add(cliente4, 0);



        Iterator iterator;
        iterator = listatype1.iterator();

        while (iterator.hasNext()){
            cliente = (Empleados) iterator.next();
            System.out.println("nombre : "+cliente.getNombre());
            System.out.println("direccion : "+cliente.getDireccion());
        }


        iterator = listaType2.iterator();

        while (iterator.hasNext()){
            cliente2 = (Empleados) iterator.next();
            System.out.println("nombre : "+cliente2.getNombre());
            System.out.println("direccion : "+cliente2.getDireccion());
        }


        iterator = listaType3.iterator();

        while (iterator.hasNext()){
            cliente4 = (Empleados) iterator.next();
            System.out.println("nombre : "+cliente4.getNombre());
            System.out.println("direccion : "+cliente4.getDireccion());
        }

    }
}

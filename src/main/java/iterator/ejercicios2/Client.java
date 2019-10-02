package iterator.ejercicios2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Client {
    public static void main(String [] args){

        Map<Integer, Empleados> empleadosMap = new HashMap<>();

        int position =0;

        PrimeraEmpresa listaempresa1 = new PrimeraEmpresa();

        listaempresa1.add(new Empleados("Empleado 1", "Direccion 1"));
        listaempresa1.add(new Empleados("Empleado 2", "Direccion 3"));
        listaempresa1.add(new Empleados("Empleado 3", "Direccion 3"));
        listaempresa1.add(new Empleados("Empleado 4", "Direccion 4"));

        SegundaEmpresa listaemresa2 = new SegundaEmpresa();

        listaemresa2.add(new Empleados("Empleado 5","Direccion 5"));
        listaemresa2.add(new Empleados("Empleado 6","Direccion 6"));
        listaemresa2.add(new Empleados("Empleado 7","Direccion 7"));
        listaemresa2.add(new Empleados("Empleado 8","Direccion 8"));

        SegundaEmpresa listaempresa3 = new SegundaEmpresa();

        listaempresa3.add(new Empleados("Empleado 9","Direccion 9"));
        listaempresa3.add(new Empleados("Empleado 10","Direccion 10"));
        listaempresa3.add(new Empleados("Empleado 11","Direccion 11"));
        listaempresa3.add(new Empleados("Empleado 12","Direccion 12"));

        CuartaEmpresa listaempresa4 = new CuartaEmpresa();

        listaempresa4.add(new Empleados("Empleado 13","Direcion 13"));
        listaempresa4.add(new Empleados("Empleado 14","Direcion 14"));
        listaempresa4.add(new Empleados("Empleado 15","Direcion 15"));
        listaempresa4.add(new Empleados("Empleado 16","Direcion 16"));

        Iterator iterator;
        iterator = listaempresa1.iterator();

        while (iterator.hasNext()){
            Empleados emp = (Empleados) iterator.next();
            empleadosMap.put(position++,emp);
        }


        iterator = (Iterator) listaemresa2.iterator();

        while (iterator.hasNext()){
            Empleados emp = (Empleados) iterator.next();
            empleadosMap.put(position++,emp);
        }

        iterator = listaempresa3.iterator();

        while (iterator.hasNext()){
            Empleados emp = (Empleados) iterator.next();
            empleadosMap.put(position++,emp);
        }


        iterator = listaempresa4.iterator();

        while (iterator.hasNext()){
            Empleados emp = (Empleados) iterator.next();
            empleadosMap.put(position++,emp);
        }


        for(Entry<Integer,Empleados> emple : empleadosMap.entrySet()){
            System.out.println("Nombre "+ emple.getValue().getNombre() + " Direccion "+emple.getValue().getDireccion());
        }

    }
}

         package singleton.ejercicios;

         public class Ventanilla {

             private static Ventanilla instance =null;
             private int codigo = 234;
             private int consultar = 23;

             private Ventanilla(){
             }

             public  static Ventanilla getInstance(){
                 if (instance==null){
                     instance = new Ventanilla();
                 }
                 return instance;
             }
             public int getConsultar(){
                 return consultar;
             }
         }

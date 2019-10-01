package mediador.ejemplo;

import java.util.HashMap;

public class TorreGeneral implements ITorre {

  //  private VueloConcreto1 user;

    HashMap<Integer, Vuelo> elmapa = new HashMap<>();

    //public void setColleage (HashMap<Integer,Vuelo> map ){user=map;}

    @Override
    public Vuelo getVuelo(int codigo) {
        return elmapa.get(codigo);
    }

    public void addVuelo (int codigo, Vuelo vuelo){
        elmapa.put(codigo,vuelo);
    }

    @Override
    public void send(String msg, Vuelo colleage, Vuelo receptor) {
       receptor.messageRecived(msg);
    }


}

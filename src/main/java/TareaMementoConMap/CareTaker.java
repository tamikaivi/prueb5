package TareaMementoConMap;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    //private ArrayList<Memento> savedStates = new ArrayList<Memento>();
    private Map<String, Memento> mapaSaveedStates = new HashMap<>();

    public void addDataBase(String k, Memento m) {
        mapaSaveedStates.put(k,m);
    }

    public Memento getDataBase(String index) {
        return mapaSaveedStates.get(index);
    }
}
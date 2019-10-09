package TareaMementoConMap;

public class Memento {

    private ConcreteObject state;

    public Memento(ConcreteObject stateToSave)
    {
        state = stateToSave;
    }

    public ConcreteObject getSavedState()
    {
        return state;
    }

}

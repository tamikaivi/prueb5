package abstractFactory.ejemploBrowser;

public class FactoryBrowser {
    enum browType{
        IE,
        CHROME,
        FIREFOX
    }
    public static Browser make(browType type){

        Browser product;
        switch (type){
            case IE:
                product = new IE();
                break;
            case CHROME:
                product = new Chrome();
                break;
            case FIREFOX:
                product = new FireFox();
                break;
            default:
                product = new Chrome();
                break;
        }
        return product;
    }
}

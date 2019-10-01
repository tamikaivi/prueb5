package abstractFactory.ejemploBrowser;

public class ClienteBrow {
    public static void main(String []args){

        FactoryBrowser.make(FactoryBrowser.browType.CHROME).create();
        FactoryBrowser.make(FactoryBrowser.browType.FIREFOX).create();
        FactoryBrowser.make(FactoryBrowser.browType.IE).create();
    }
}

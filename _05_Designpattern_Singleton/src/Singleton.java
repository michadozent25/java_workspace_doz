/**
 * nur eine Instanz von Objekten
 * final -keine Vererbung
 * Lazy -Singleton
 */



public final class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    //synchronized: Thread-Sicher
    // static -> ohne Objekt aufrufen: Singleton.getInstance();
    public synchronized static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }


    public void andereMethode(){

    }

}

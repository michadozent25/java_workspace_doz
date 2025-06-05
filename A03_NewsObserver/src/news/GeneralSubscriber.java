package news;


public class GeneralSubscriber implements NewsSubscriber {
    private String name;

    public GeneralSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String category, String message) {
        System.out.println("[GeneralSubscriber " + name + "] empfängt Nachricht in Kategorie " + category + ": " + message);
    }
}

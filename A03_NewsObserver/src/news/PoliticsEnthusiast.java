package news;



public class PoliticsEnthusiast implements NewsSubscriber {
    private String name;

    public PoliticsEnthusiast(String name) {
        this.name = name;
    }

    @Override
    public void update(String category, String message) {
        System.out.println("[PoliticsEnthusiast " + name + "] empfängt Politiknachricht: " + message);
    }
}

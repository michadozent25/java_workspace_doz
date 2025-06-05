package news;


public class SportsFan implements NewsSubscriber {
    private String name;

    public SportsFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String category, String message) {
        System.out.println("[SportsFan " + name + "] empfängt Sportnachricht: " + message);
    }
}

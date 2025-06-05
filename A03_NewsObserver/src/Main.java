import news.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsSubscriber alice = new SportsFan("Alice");
        NewsSubscriber bob = new PoliticsEnthusiast("Bob");
        NewsSubscriber carol = new GeneralSubscriber("Carol");

        agency.registerSubscriber("Sport", alice);
        agency.registerSubscriber("Politik", bob);
        agency.registerSubscriber("Sport", carol);
        agency.registerSubscriber("Politik", carol);

        agency.publishNews("Sport", "FC Bayern gewinnt 3:1 gegen Dortmund!");
        agency.publishNews("Politik", "Koalitionsverhandlungen erfolgreich beendet.");
        agency.publishNews("Wetter", "Sonnenschein und 25 Grad in ganz Deutschland.");
    }
}

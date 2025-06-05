package news;


import java.util.*;

public class NewsAgency {
    private Map<String, List<NewsSubscriber>> subscribers = new HashMap<>();

    public void registerSubscriber(String category, NewsSubscriber subscriber) {
        subscribers.computeIfAbsent(category, k -> new ArrayList<>()).add(subscriber);
    }

    public void removeSubscriber(String category, NewsSubscriber subscriber) {
        List<NewsSubscriber> subs = subscribers.get(category);
        if (subs != null) {
            subs.remove(subscriber);
        }
    }

    public void publishNews(String category, String message) {
        System.out.println("\n[Nachricht] " + category + ": " + message);
        List<NewsSubscriber> subs = subscribers.get(category);
        if (subs != null) {
            for (NewsSubscriber subscriber : subs) {
                subscriber.update(category, message);
            }
        }
    }
}

package newsSubscription;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsSubject {
    private String latestHeadline;
    private final List<Observer> subscribers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        if (!subscribers.contains(observer)) {
            subscribers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestHeadline);
        }
    }

    // Business logic method to publish breaking news
    public void publishNews(String headline) {
        this.latestHeadline = headline;
        System.out.println("\n📢 [Agency] Publishing Breaking News: " + headline);
        notifySubscribers(); // Automatically push updates to all observers
    }
}

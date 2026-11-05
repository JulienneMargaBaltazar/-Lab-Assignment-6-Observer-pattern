package newsSubscription;

public interface NewsSubject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifySubscribers();
}

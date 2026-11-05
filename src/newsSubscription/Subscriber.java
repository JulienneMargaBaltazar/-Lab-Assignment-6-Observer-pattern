package newsSubscription;

public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String headline) {
        System.out.println("🔔 [Notification] " + name + " received update: \"" + headline + "\"");
    }

    public String getName() {
        return name;
    }
}

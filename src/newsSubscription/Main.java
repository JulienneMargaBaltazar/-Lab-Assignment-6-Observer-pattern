package newsSubscription;

public class Main {
    public static void main(String[] args) {
        NewsAgency gmaNews = new NewsAgency();

        Subscriber sub1 = new Subscriber("Maria");
        Subscriber sub2 = new Subscriber("Juan");
        Subscriber sub3 = new Subscriber("Oliver");

        System.out.println("--- Initial Subscriptions ---");
        gmaNews.attach(sub1);
        gmaNews.attach(sub2);
        gmaNews.attach(sub3);

        gmaNews.publishNews("Typhoon enters area of responsibility; heavy rains expected.");

        System.out.println("\n--- Updating Subscriptions ---");
        gmaNews.detach(sub2);

        Subscriber sub4 = new Subscriber("Jerry");
        gmaNews.attach(sub4);

        gmaNews.publishNews("Tech Summit 2026 highlights breakthrough advancements in AI.");
    }
}

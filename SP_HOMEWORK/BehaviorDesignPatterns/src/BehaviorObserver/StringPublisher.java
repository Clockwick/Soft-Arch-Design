package BehaviorObserver;

import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher<String>{

    private StringSubscription subscription;

    public StringPublisher() {
        this.subscription = new StringSubscription();
    }

    private static final int MAX_SUBSCRIBER = 3;
    private static int numberOfSubscriber = 0;
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        if (numberOfSubscriber < MAX_SUBSCRIBER) {
            numberOfSubscriber += 1;
            subscriber.onSubscribe(subscription);
        } else {
            subscriber.onError(new IllegalStateException());
        }
    }

    public void publish(String item) {
        for (StringSubscriber subscriber : this.subscription.getSubscribers()) {
            subscriber.onNext(item);
        }
    }
}

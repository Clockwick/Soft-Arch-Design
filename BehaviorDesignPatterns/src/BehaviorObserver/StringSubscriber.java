package BehaviorObserver;

import java.io.File;
import java.util.concurrent.Flow;

abstract public class StringSubscriber implements Flow.Subscriber<String> {

    protected File file;
    protected Flow.Subscription subscription;

    public StringSubscriber() {}

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {}

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("complete");
    }

    public void unsubscribe() {
        this.subscription.cancel();
        this.subscription = null;
    }
}

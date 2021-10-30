package BehaviorObserver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.concurrent.Flow;

public class SymbolSubscriber extends StringSubscriber {
    public SymbolSubscriber() {
        String filename = "Symbol.txt";
        Path filePath = Paths.get(System.getProperty("user.dir"), "src", "output", filename);

        this.file = new File(filePath.toString());
    }
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        ((StringSubscription) this.subscription).addSubscriber(this);
    }

    public void onNext(String item) {

        if (item.matches("(.*)[[^A-Za-z0-9]&&[^\s\n\t]](.*)")) {
            try {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                FileWriter fileWriter = new FileWriter(file, true);

                fileWriter.write(timestamp.toString() + " : " + item + "\n");

                fileWriter.flush();
                fileWriter.close();

                fileWriter = null;
                timestamp = null;
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
    }
}

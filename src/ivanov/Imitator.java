package ivanov;

import java.util.concurrent.TimeUnit;

/**
 * Created by happy on 12/10/16.
 */
public class Imitator {

    public static void imitateOperation(int iterationsAmount, long sleepTime) {
        for (int i = 0; i < iterationsAmount; i++) {

            try {
                TimeUnit.MILLISECONDS.sleep(sleepTime);

            } catch (InterruptedException e) {
                // do nothing, it's demo
            }

        }
    }

}

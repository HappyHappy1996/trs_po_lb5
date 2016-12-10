package ivanov;

import ivanov.threads.CustomThread;

/**
 * Created by happy on 12/10/16.
 */
public class Analyzer {

    public static void analyze(CustomThread[] childCompanyThreads) {

        for (CustomThread thread : childCompanyThreads) {
            thread.start();
        }

        for (CustomThread thread : childCompanyThreads) {

            try {
                thread.join();

            } catch (InterruptedException e) {
                // do nothing, it's demo
            }
        }
    }

}

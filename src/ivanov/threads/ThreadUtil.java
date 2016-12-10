package ivanov.threads;

/**
 * Created by happy on 12/10/16.
 */
public class ThreadUtil {

    public static CustomThread[] createCustomThreads(int amount) {
        CustomThread[] array = new CustomThread[amount];

        for (int i = 0; i < array.length; i++) {
            array[i] = new CustomThread();
            array[i].start();
        }

        for (CustomThread thread : array) {

            try {
                thread.join();

            } catch (InterruptedException e) {
                // do nothing, it's demo
            }
        }

        return array;
    }

    public static CustomThread[] createCustomThreadsCopy(CustomThread[] threads) {
        CustomThread[] array = new CustomThread[threads.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new CustomThread(threads[i].getChildCompany());
        }

        return array;
    }

}

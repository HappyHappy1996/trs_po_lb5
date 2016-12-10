package ivanov;

import ivanov.threads.CustomThread;
import ivanov.threads.ThreadUtil;

import static ivanov.Constants.CHILD_COMPANIES_AMOUNT;
import static ivanov.Constants.SEND_DATA_TIME;

public class Demo {

    // for debug convenience
    private static int secondsDivisor = 1;

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        /*
            CREATE INSTANCES WITH CHILD COMPANIES DATA
         */
        CustomThread[] childCompanyThreads = ThreadUtil.createCustomThreads(CHILD_COMPANIES_AMOUNT);

        long collectDataStageTime = System.currentTimeMillis();
        System.out.println("Time for 1st stage (in seconds) : " + (collectDataStageTime - startTime) / secondsDivisor);



        /*
            IMITATE DATA SENDING TO MAIN CENTER
         */
        Imitator.imitateOperation(1, SEND_DATA_TIME);

        long sendDataStageTime = System.currentTimeMillis();
        System.out.println("Time for 2nd stage (in seconds) : " + (sendDataStageTime - startTime) / secondsDivisor);



        /*
            ANALYZE DATA FROM CHILD COMPANIES IN THE MAIN CENTER
         */
        CustomThread[] receivedChildCompanyThreads = ThreadUtil.createCustomThreadsCopy(childCompanyThreads);
        Analyzer.analyze(receivedChildCompanyThreads);

        long analyzedStageTime = System.currentTimeMillis();
        System.out.println("Time for 3rd stage (in seconds) : " + (analyzedStageTime - startTime) / secondsDivisor);

    }
}
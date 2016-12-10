package ivanov.threads;

import ivanov.ChildCompany;
import ivanov.Imitator;

import static ivanov.Constants.INFORMATION_BLOCKS_AMOUNT;
import static ivanov.Constants.TIME_UNIT;

/**
 * Created by happy on 12/10/16.
 */
public class CustomThread extends Thread {

    private int difficultyCoef;
    private ChildCompany childCompany;

    public ChildCompany getChildCompany() {
        return childCompany;
    }

    // thread that will receive own child company when it will start
    CustomThread() {}

    CustomThread(ChildCompany childCompany) {
        this.childCompany = childCompany;
    }

    public void run() {
        if (childCompany == null) {
            childCompany = ChildCompany.instantiate();

        } else {
            // do some long work for every information block
            for (int i = 0; i < INFORMATION_BLOCKS_AMOUNT; i++) {

                Imitator.imitateOperation(1, TIME_UNIT);
            }
        }

    }

}

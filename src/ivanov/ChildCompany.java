package ivanov;

import static ivanov.Constants.INFORMATION_BLOCKS_AMOUNT;
import static ivanov.Constants.TIME_UNIT;

/**
 * Created by happy on 12/10/16.
 */
public class ChildCompany {

    private Integer[] integerArray;
    private String string1;
    private String string2;
    private String string3;
    private String string4;
    private String string5;
    private String string6;
    private String string7;
    private String string8;
    private String string9;
    private String string10;
    private String string11;
    private String string12;
    private String string13;
    private String string14;
    private String string15;
    private String string16;

    public ChildCompany(Integer[] integerArray, String string1, String string2, String string3,
                        String string4,String string5, String string6, String string7, String string8,
                        String string9, String string10, String string11, String string12, String string13,
                        String string14, String string15, String string16) {
        this.integerArray = integerArray;
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
        this.string4 = string4;
        this.string5 = string5;
        this.string6 = string6;
        this.string7 = string7;
        this.string8 = string8;
        this.string9 = string9;
        this.string10 = string10;
        this.string11 = string11;
        this.string12 = string12;
        this.string13 = string13;
        this.string14 = string14;
        this.string15 = string15;
        this.string16 = string16;
    }

    public static ChildCompany instantiate() {
        Imitator.imitateOperation(INFORMATION_BLOCKS_AMOUNT, TIME_UNIT);

        return new ChildCompany(new Integer[]{1, 2, 3}, "data", "data2", "data3",
                "data4", "data5", "data6", "data7", "data8",
                "data9", "data10", "data11", "data12",
                "data13", "data14", "data15", "data16");
    }

}

package job4jtask.comparator;

import job4jtask.model.DigitArr;

import java.util.Comparator;

public class DigitArrComparatorThird implements Comparator<DigitArr> {
    @Override
    public int compare(DigitArr dArr1, DigitArr dArr2) {
        return dArr1.getThird() - dArr2.getThird();
    }
}

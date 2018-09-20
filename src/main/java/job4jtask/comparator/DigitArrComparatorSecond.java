package job4jtask.comparator;

import job4jtask.model.DigitArr;

import java.util.Comparator;

public class DigitArrComparatorSecond implements Comparator<DigitArr> {
    @Override
    public int compare(DigitArr dArr1, DigitArr dArr2) {
        return dArr1.getSecond() - dArr2.getSecond();
    }
}

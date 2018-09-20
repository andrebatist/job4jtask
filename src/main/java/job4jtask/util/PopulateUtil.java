package job4jtask.util;

import job4jtask.model.DigitArr;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PopulateUtil {
    private static final Logger LOGGER =  Logger.getLogger(PopulateUtil.class);

    public static List<String> populateSubdivListExample() {
        List<String> list = new ArrayList<>();
        list.add("K1\\SK1");
        list.add("K1\\SK2");
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K2");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        return list;
    }

    public static List<String> populateSubdivListASCCorrectExample() {
        List<String> list = new ArrayList<>();
        list.add("K1");
        list.add("K1\\SK1");
        list.add("K1\\SK1\\SSK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K1\\SK2");
        list.add("K2");
        list.add("K2\\SK1");
        list.add("K2\\SK1\\SSK1");
        list.add("K2\\SK1\\SSK2");
        return list;
    }

    public static List<String> populateSubdivListDESCCorrectExample() {
        List<String> list = new ArrayList<>();
        list.add("K2");
        list.add("K2\\SK1");
        list.add("K2\\SK1\\SSK2");
        list.add("K2\\SK1\\SSK1");
        list.add("K1");
        list.add("K1\\SK2");
        list.add("K1\\SK1");
        list.add("K1\\SK1\\SSK2");
        list.add("K1\\SK1\\SSK1");

        return list;
    }


    public List<DigitArr> populateDigitArrListExample() {
        List<DigitArr> digitArrs = new ArrayList<>();

        DigitArr digitArr=new DigitArr();
        List<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(1);
        digitArr.setDigits(digits);
        digitArr.setFirst(1);
        digitArr.setSecond(1);
        digitArr.setThird(0);
        digitArrs.add(digitArr);

        DigitArr digitArr1=new DigitArr();
        List<Integer> digits1 = new ArrayList<>();
        digits1.add(1);
        digits1.add(2);
        digitArr1.setDigits(digits1);
        digitArr1.setFirst(1);
        digitArr1.setSecond(2);
        digitArr1.setThird(0);
        digitArrs.add(digitArr1);

        DigitArr digitArr__=new DigitArr();
        List<Integer> digits__ = new ArrayList<>();
        digits__.add(1);
        digits__.add(1);
        digits__.add(1);
        digitArr__.setDigits(digits__);
        digitArr__.setFirst(1);
        digitArr__.setSecond(1);
        digitArr__.setThird(1);
        digitArrs.add(digitArr__);

        DigitArr digitArr_=new DigitArr();
        List<Integer> digits_ = new ArrayList<>();
        digits_.add(1);
        digits_.add(1);
        digits_.add(2);
        digitArr_.setDigits(digits_);
        digitArr_.setFirst(1);
        digitArr_.setSecond(1);
        digitArr_.setThird(2);
        digitArrs.add(digitArr_);


        DigitArr digitArr2=new DigitArr();
        List<Integer> digits2 = new ArrayList<>();
        digits2.add(2);
        digitArr2.setDigits(digits2);
        digitArr2.setFirst(2);
        digitArr2.setSecond(0);
        digitArr2.setThird(0);
        digitArrs.add(digitArr2);

        DigitArr digitArr3=new DigitArr();
        List<Integer> digits3 = new ArrayList<>();
        digits3.add(2);
        digits3.add(1);
        digits3.add(1);
        digitArr3.setDigits(digits3);
        digitArr3.setFirst(2);
        digitArr3.setSecond(1);
        digitArr3.setThird(1);
        digitArrs.add(digitArr3);

        DigitArr digitArr4=new DigitArr();
        List<Integer> digits4 = new ArrayList<>();
        digits4.add(2);
        digits4.add(1);
        digits4.add(2);
        digitArr4.setDigits(digits4);
        digitArr4.setFirst(2);
        digitArr4.setSecond(1);
        digitArr4.setThird(2);
        digitArrs.add(digitArr4);

        return digitArrs;
    }
}

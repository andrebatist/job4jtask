package job4jtask.util;

import job4jtask.model.DigitArr;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserUtil {
    private static final Pattern VALID_PATTERN = Pattern.compile("[0-9]+");

    private static List<Integer> parseStr(String toParse) {
        List<Integer> digits = new ArrayList<>();
        Matcher matcher = VALID_PATTERN.matcher(toParse);
        while (matcher.find()) {
            digits.add( Integer.valueOf(matcher.group()));
        }
        return digits;
    }

    public static List<DigitArr> parseStrList(List<String> strList) {
        List<DigitArr> digitArrs = new ArrayList<>();
        for (String str: strList) {
            DigitArr digitArr = new DigitArr();
            List<Integer> digits = parseStr(str);
            switch (digits.size()) {
                case 1:
                    digitArr.setFirst(digits.get(0));
                    digitArr.setSecond(0);
                    digitArr.setThird(0);
                    break;
                case 2:
                    digitArr.setFirst(digits.get(0));
                    digitArr.setSecond(digits.get(1));
                    digitArr.setThird(0);
                    break;
                case 3:
                    digitArr.setFirst(digits.get(0));
                    digitArr.setSecond(digits.get(1));
                    digitArr.setThird(digits.get(2));
                    break;
            }
            digitArr.setDigits(digits);
            digitArrs.add(digitArr);
        }
        return digitArrs;
    }

    public static List<String> getStrSortedArray(List<DigitArr> digitArrs) {
        List<String> strs = new ArrayList<>();
        for (DigitArr digitArr: digitArrs) {
            List<Integer> digits = digitArr.getDigits();
            StringBuilder builder = new StringBuilder();
            switch (digits.size()) {
                case 1:
                    builder.append("K").append(digits.get(0));
                    break;
                case 2:
                    builder.append("K").append(digits.get(0));
                    builder.append("\\SK").append(digits.get(1));
                    break;
                case 3:
                    builder.append("K").append(digits.get(0));
                    builder.append("\\SK").append(digits.get(1));
                    builder.append("\\SSK").append(digits.get(2));
                    break;
            }
            String completedStr=builder.toString();
            strs.add(completedStr);
        }
        return strs;
    }
}

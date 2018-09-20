package job4jtask.util;

import job4jtask.comparator.DigitArrComparatorFirst;
import job4jtask.comparator.DigitArrComparatorSecond;
import job4jtask.comparator.DigitArrComparatorThird;
import job4jtask.model.DigitArr;

import java.util.*;

public class SortUtil {
    public List<String> sortSubdivisionsList(List<String> subs, boolean isAsc) {
        List<DigitArr> digitArrs = ParserUtil.parseStrList(subs);
        digitArrs = sort(digitArrs,isAsc);
        return ParserUtil.getStrSortedArray(digitArrs);
    }

    public List<DigitArr> sort(List<DigitArr> arrs, boolean isAsc) {
        Collections.sort(arrs, new DigitArrComparatorFirst());
        if (!isAsc) Collections.reverse(arrs);
        List<DigitArr> secondList = new ArrayList<>();
        int num =0;
        for (DigitArr digitArr: arrs) {
            if (num!=digitArr.getFirst()) {
                num = digitArr.getFirst();
                List<DigitArr> tmp = new ArrayList<>();
                for (DigitArr digitArrTmp : arrs) {
                    if (digitArrTmp.getFirst() == num) {
                        tmp.add(digitArrTmp);
                    }
                }
                Collections.sort(tmp, new DigitArrComparatorSecond());
                if (!isAsc) Collections.reverse(tmp);
                secondList.addAll(tmp);
            }
        }
        List<DigitArr> thirdList = new ArrayList<>();
        int firNum = 0;
        int secNum = -1;
        for (DigitArr digitArr: secondList) {
            if (firNum!=digitArr.getFirst()) {
                firNum = digitArr.getFirst();
                secNum=-1;
            }
            if (secNum!=digitArr.getSecond()) {
                secNum = digitArr.getSecond();
                List<DigitArr> tmp = new ArrayList<>();
                for (DigitArr digitArrTmp : secondList) {
                    if ((digitArrTmp.getSecond() == secNum)&&(digitArrTmp.getFirst() == firNum)) {
                        tmp.add(digitArrTmp);
                    }
                }
                Collections.sort(tmp, new DigitArrComparatorThird());
                if (!isAsc) Collections.reverse(tmp);
                thirdList.addAll(tmp);
            }
        }
        thirdList = insertDigitsFirst(thirdList);
        thirdList = insertDigitsSecond(thirdList);
        return thirdList;
    }

    private List<DigitArr> insertDigitsFirst(List<DigitArr> arrs) {
        int num = 0;
        int index =0;
        int inserts=0;
        boolean isElPresent=false;
        List<DigitArr> updatedList = new ArrayList<>(arrs);
        for (DigitArr digitArr: arrs) {
            if (num!=digitArr.getFirst()) {
                num = digitArr.getFirst();
                for (DigitArr digitArrTmp : arrs) {
                    if ((digitArrTmp.getFirst()==num)&&(digitArrTmp.getSecond()==0)
                            &&(digitArrTmp.getThird()==0))
                        isElPresent=true;
                }
                if (!isElPresent) {
                    DigitArr digitArrTmp=new DigitArr();
                    List<Integer> digits = new ArrayList<>();
                    digits.add(num);
                    digitArrTmp.setDigits(digits);
                    digitArrTmp.setFirst(num);
                    digitArrTmp.setSecond(0);
                    digitArrTmp.setThird(0);
                    updatedList.add(index+inserts,digitArrTmp);
                    inserts++;
                }
            }
            index++;
            isElPresent=false;
        }
        return updatedList;
    }

    private List<DigitArr> insertDigitsSecond(List<DigitArr> arrs) {
        int numFirst = 0;
        int numSecond =-1;
        int index =0;
        int inserts=0;
        boolean isElPresent=false;
        List<DigitArr> updatedList = new ArrayList<>(arrs);
        for (DigitArr digitArr: arrs) {
            if ((numFirst!=digitArr.getFirst())&&(numSecond!=digitArr.getSecond())) {
                numFirst = digitArr.getFirst();
                numSecond = digitArr.getSecond();
                for (DigitArr digitArrTmp : arrs) {
                    if ((digitArrTmp.getFirst()==numFirst)&&(digitArrTmp.getSecond()==numSecond)
                            &&(digitArrTmp.getThird()==0)) {
                        isElPresent = true;
                    }
                }
                if (!isElPresent) {
                    DigitArr digitArrTmp=new DigitArr();
                    List<Integer> digits = new ArrayList<>();
                    digits.add(numFirst);
                    digits.add(numSecond);
                    digitArrTmp.setDigits(digits);
                    digitArrTmp.setFirst(numFirst);
                    digitArrTmp.setSecond(numSecond);
                    digitArrTmp.setThird(0);
                    updatedList.add(index+inserts,digitArrTmp);
                    inserts++;
                }
            }
            index++;
            isElPresent=false;
        }
        return updatedList;
    }
}

package job4jtask.util;

import job4jtask.model.DigitArr;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortUtilTest {
    private static final Logger LOGGER =  Logger.getLogger(SortUtilTest.class);

    PopulateUtil populateUtil = new PopulateUtil();
    SortUtil sortUtil = new SortUtil();

    @Test
    public void taskExampleTestAsc()
    {
        List<String> list = PopulateUtil.populateSubdivListExample();
        LOGGER.info("Unsorted list:");
        for (String str: list) {
            LOGGER.info(str);
        }
        List<String> reslist=sortUtil.sortSubdivisionsList(list,true);
        LOGGER.info("/**----------------sorted list asc----------------**/");
        for (String str: reslist) {
            LOGGER.info(str);
        }
        List<String> correctList = PopulateUtil.populateSubdivListASCCorrectExample();
        assertEquals(correctList,reslist);
    }

    @Test
    public void taskExampleTestDesc()
    {
        List<String> list = PopulateUtil.populateSubdivListExample();
        LOGGER.info("Unsorted list:");
        for (String str: list) {
            LOGGER.info(str);
        }
        List<String> reslist=sortUtil.sortSubdivisionsList(list,false);
        LOGGER.info("/**----------------sorted list desc----------------**/");
        for (String str: reslist) {
            LOGGER.info(str);
        }
        List<String> correctList = PopulateUtil.populateSubdivListDESCCorrectExample();
        assertEquals(correctList,reslist);
    }

    @Test
    public void sortElementsTest()
    {
        PopulateUtil populateUtil = new PopulateUtil();
        List<DigitArr> digitArrList = populateUtil.populateDigitArrListExample();
        BasicConfigurator.configure();
        LOGGER.info("old list:");
        for (DigitArr digitArr: digitArrList) {
            String line="";
            for (Integer num :digitArr.getDigits()) {
                line=line+num+" ";
            }
            LOGGER.info(line);
        }

        SortUtil sortUtil = new SortUtil();

        List<DigitArr> digitArrList1 = new ArrayList<>();
        digitArrList1 = sortUtil.sort(digitArrList,true);

        LOGGER.info("sorted list:------------");
        for (DigitArr digitArr: digitArrList1) {
            String line="";
            for (Integer num :digitArr.getDigits()) {
                line=line+num+" ";
            }
            LOGGER.info(line);
        }
    }
}
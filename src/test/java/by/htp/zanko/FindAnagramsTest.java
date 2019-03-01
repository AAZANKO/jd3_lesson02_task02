package by.htp.zanko;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class FindAnagramsTest {

    @Test
    public void checkGetFindAnagrams(){

        String[] arrayString = new String[10];

        FindAnagrams findAnagrams = new FindAnagrams();

        arrayString[0] = "asd";
        arrayString[1] = "dsa";
        arrayString[2] = "qwe";
        arrayString[3] = "wer";
        arrayString[4] = "rty";
        arrayString[5] = "gfh";
        arrayString[6] = "vbn";
        arrayString[7] = "acxv";
        arrayString[8] = "vbcv";
        arrayString[9] = "nbv";

        Map<String, String> map = findAnagrams.getFindAnagrams(arrayString);
        Assert.assertNotNull(map);
    }
}
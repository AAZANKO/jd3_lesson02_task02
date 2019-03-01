package by.htp.zanko;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagrams {

    public Map<String, String> getFindAnagrams(String[] arrayString) {

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < arrayString.length; i++) {

            String tmpWord = arrayString[i];

            char[] sym = arrayString[i].toCharArray();

            Arrays.sort(sym);

            String wordKey = new String(sym);

            String value = map.get(wordKey);

            if (value == null) {
                map.put(wordKey, tmpWord);
            } else {
                map.put(wordKey, value + " " + tmpWord);
            }
        }
        return map;
    }
}

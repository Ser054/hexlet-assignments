package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// BEGIN
public class App {
    public static boolean scrabble(String randomStr, String natureStr) {
        if (randomStr == null || natureStr == null || randomStr.length() < natureStr.length()) {
            return false;
        }
        randomStr = randomStr.toLowerCase();
        natureStr = natureStr.toLowerCase();
        List<Character> listRandChrs = new ArrayList<Character>();
        for (int i = 0; i < randomStr.length(); i++) {
            listRandChrs.add(randomStr.charAt(i));
        }
        for (int i = 0; i < natureStr.length(); i++) {
            int findIndex = listRandChrs.indexOf(natureStr.charAt(i));
            if (findIndex != -1) {
                listRandChrs.remove(findIndex);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
//END

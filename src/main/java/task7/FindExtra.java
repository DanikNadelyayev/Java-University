package task7;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindExtra {
    public static ArrayList<String> findWords(String inp, String text) {
        ArrayList<String> t = new ArrayList<String>();
        for (String retval : inp.split(" ")) {
            Pattern pt = Pattern.compile(retval, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pt.matcher(text);
            boolean matchFound = matcher.find();
            if(!matchFound) {
                t.add(retval);
            }
        }
        return t;
    }
}

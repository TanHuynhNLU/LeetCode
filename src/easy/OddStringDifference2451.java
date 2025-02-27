package easy;

import java.util.HashMap;
import java.util.Map;

public class OddStringDifference2451 {
    public String oddString(String[] words) {
        String dupString = "";
        String tmp1 = extractString(words[0]);
        String tmp2 = extractString(words[1]);
        if (tmp1.equals(tmp2)) {
            dupString = tmp1;
            for (int i = 2; i < words.length; i++) {
                if (!extractString(words[i]).equals(dupString)) return words[i];
            }
        } else {
            String tmp3 = extractString(words[2]);
            if (tmp3.equals(tmp2)) {
                return words[0];
            } else return words[1];
        }
        return "";
    }

    public String extractString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            sb.append(b - a);
            sb.append(',');
        }
        return sb.toString();
    }

}

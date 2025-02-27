package easy;

import java.util.HashSet;

public class NumberOfDifferentIntegersInAString1805 {
    public static int numDifferentIntegers(String word) {
        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                sb.append(chars[i]);
            } else {
                if (!sb.isEmpty()) {
                    int index = 0;
                    while (index != sb.length() - 1 && sb.charAt(index) == '0') index++;
                    set.add(sb.substring(index).toString());
                    sb = new StringBuilder();
                }
            }
        }
        if (!sb.isEmpty()) {
            int index = 0;
            while (index != sb.length() - 1 && sb.charAt(index) == '0') index++;
            set.add(sb.substring(index).toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        numDifferentIntegers("xtimt5kqkz9osexe56ezwwninlyeeqsq5m99904os3ygs12t31n1et4uwzmt5kvv6teisobuxt10k33v1aaxysg4y8nsivxdp3fo9dr7x58m8uc4ofm41ai77u8cvzr5r3s97f5otns59ubqk57xwl00xsp9w2oodt6yxcbscloyr9c2su8gca1ly6rrjufm25luhxhesxwn7bk1as9na4cbabxk");
    }
}

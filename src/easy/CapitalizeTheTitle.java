package easy;

public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp;
        for (String word : title.toLowerCase().split(" ")) {
            tmp = new StringBuilder(word);
            if (word.length() > 2) {
                tmp.setCharAt(0, Character.toUpperCase(tmp.charAt(0)));
            }
            sb.append(tmp).append(" ");
        }
        return sb.toString().trim();
    }
//     Best Solution
//    public String capitalizeTitle(String title) {
//
//        StringBuilder sb = new StringBuilder(title.toLowerCase());
//        int start = 0;
//
//        for (int i = 0; i <= sb.length(); i++) {
//            if (i == sb.length() || sb.charAt(i) == ' ') {
//                if (i - start >= 3) {
//                    sb.setCharAt(start, Character.toUpperCase(sb.charAt(start)));
//                }
//                start = i + 1;
//            }
//        }
//
//        return sb.toString();
//    }
}

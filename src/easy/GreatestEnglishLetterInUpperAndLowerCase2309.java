package easy;

public class GreatestEnglishLetterInUpperAndLowerCase2309 {
    public String greatestLetter(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper[c - 'A'] = true;
            } else {
                lower[c - 'a'] = true;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (upper[i] && lower[i]) return Character.toString('A' + i);
        }
        return "";
    }

    //    Best Solution
//    public String greatestLetter(String s) {
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        int start = alphabet.length() - 1;
//        for (int i = start; i >= 0; i--) {
//            char current = alphabet.charAt(i);
//            if (s.indexOf(current) != -1 && s.indexOf(Character.toLowerCase(current)) != -1) {
//                return String.valueOf(current);
//            }
//        }
//        return "";
//    }
}

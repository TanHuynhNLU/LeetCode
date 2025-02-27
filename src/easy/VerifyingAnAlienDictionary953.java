package easy;

public class VerifyingAnAlienDictionary953 {
    public static boolean isAlienSorted(String[] words, String order) {
        if (words.length == 1) return true;
        for (int i = 1; i < words.length; i++) {
            int max = Math.max(words[i].length(), words[i - 1].length());
            for (int j = 0; j < max; j++) {
                if (j >= words[i - 1].length()) break;
                int index = j >= words[i].length() ? -1 : order.indexOf(words[i].charAt(j));
                int prevIndex = order.indexOf(words[i - 1].charAt(j));
                if (index < prevIndex) return false;
                if(index>prevIndex) break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] s = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(s, order));
    }
}

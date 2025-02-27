package easy;

public class ExistenceOfASubstringInAStringAndItsReverse3083 {
    public static boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 2);
            if (sb.indexOf(sub) != -1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isSubstringPresent("abcd");
    }
}

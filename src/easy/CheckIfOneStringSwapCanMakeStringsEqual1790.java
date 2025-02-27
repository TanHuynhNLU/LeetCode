package easy;

public class CheckIfOneStringSwapCanMakeStringsEqual1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int count = 0;
        char c1 = 0, c2 = 0;
        boolean flag = false;
        for (int i = 0; i < s1.length(); i++) {
            if (chars1[i] == chars2[i]) {
                continue;
            }
            else count++;
            if (count == 1) {
                c1 = chars1[i];
                c2 = chars2[i];
            } else if (count == 2) {
                if (chars1[i] == c2 && chars2[i] == c1) {
                    flag = true;
                }
            }else if (count == 3){
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        areAlmostEqual("bank","kanb");
    }
}

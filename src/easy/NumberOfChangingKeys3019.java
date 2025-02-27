package easy;

public class NumberOfChangingKeys3019 {
    public int countKeyChanges(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int res = 0;
        char prev = chars[0];
        for (int i = 0; i < s.length(); i++) {
            prev = chars[i];
            while(i < s.length()&&chars[i] == prev) i++;
            res++;
            i--;
        }
        return res - 1;
    }
}

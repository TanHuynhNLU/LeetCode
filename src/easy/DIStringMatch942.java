package easy;

public class DIStringMatch942 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n + 1];
        char[] chars = s.toCharArray();
        int start = 0;
        int end = n;
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'I')
                res[i] = start++;
            else
                res[i] = end--;
        }
        if (chars[n-1] == 'I')
            res[n] = start;
        else
            res[n] = end;
        return res;
    }
}

package easy;

public class CountSubstringsThatSatisfyKConstraintI3258 {
    public int countKConstraintSubstrings(String s, int k) {
        int notContained = 0;
        int n = s.length();
        for (int i = k + 1; i <= n; i++) {
            notContained += countNotContainingKSubstrings(s, i, k);
        }
        return n * (n - 1) / 2 - notContained;
    }

    public int countNotContainingKSubstrings(String s, int size, int k) {
        int res = 0;
        for (int i = 0; i < s.length() - size + 1; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = i; j < i + size; j++) {
                if (s.charAt(j) == '0') count0++;
                if (s.charAt(j) == '1') count1++;
            }
            if (count1 > k && count0 > k) {
                res++;
            }
        }
        return res;
    }

//    public int countKConstraintSubstrings(String s, int k) {
//        int L = 0; int R = 0;
//        int res = 0 ;
//        int[] count = new int[2];
//        char[] chars = s.toCharArray();
//        while (R<s.length()) {
//            count[chars[R]-'0'] ++;
//            while( !(count[0] <= k || count[1] <= k)) {
//                count[chars[L]-'0']--;
//                L++;
//            }
//            res += R-L+1;
//            R++;
//        }
//        return res;
//
//    }
}

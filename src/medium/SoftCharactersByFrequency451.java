package medium;

import java.util.ArrayList;
import java.util.List;

public class SoftCharactersByFrequency451 {
    public String frequencySort(String s) {
        int[] counter = new int[75];
        for (char c : s.toCharArray()) {
            counter[c - '0']++;
        }
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < 75; i++) {
            if (counter[i] != 0) {
                pairs.add(new Pair((char) (i + 48), counter[i]));
            }
        }
        pairs.sort((a, b) -> Integer.compare(b.freq, a.freq));
        StringBuilder sb = new StringBuilder();
        for (Pair pair : pairs) {
            for (int i = 0; i < pair.freq; i++) {
                sb.append(pair.c);
            }
        }
        return sb.toString();
    }

    class Pair {
        char c;
        int freq;

        public Pair(char c, int freq) {
            this.c = c;
            this.freq = freq;
        }
    }

    // Another Approach

//    static {
//        for (int i = 0; i < 500; i++) {
//            frequencySort(new String());
//        }
//    }
//
//    public static int findMaxI(int[] f) {
//        int maxi = 0;
//        int max = 0;
//        for (int i = 0; i < f.length; i++) {
//            if (f[i] > max) {
//                maxi = i;
//                max = f[i];
//            }
//        }
//        return maxi;
//    }
//
//    public static String frequencySort(String s) {
//        int[] f = new int[128];
//        for (char c : s.toCharArray()) {
//            f[c] += 1;
//        }
//        char[] res = new char[s.length()];
//        int i = 0;
//        while (i < s.length()) {
//            int maxi = findMaxI(f);
//            int freq = f[maxi];
//            while (freq > 0) {
//                res[i++] = (char) (maxi);
//                freq--;
//            }
//            f[maxi] = 0;
//        }
//        return new String(res);
//    }
}

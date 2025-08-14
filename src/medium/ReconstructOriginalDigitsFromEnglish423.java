package medium;

public class ReconstructOriginalDigitsFromEnglish423 {
    public String originalDigits(String s) {
        int[] counter = new int[10];
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        while (freq['z' - 'a'] != 0) {
            counter[0]++;
            freq['z' - 'a']--;
            freq['e' - 'a']--;
            freq['r' - 'a']--;
            freq['o' - 'a']--;
        }
        while (freq['w' - 'a'] != 0) {
            counter[2]++;
            freq['t' - 'a']--;
            freq['w' - 'a']--;
            freq['o' - 'a']--;
        }
        while (freq['u' - 'a'] != 0) {
            counter[4]++;
            freq['f' - 'a']--;
            freq['o' - 'a']--;
            freq['u' - 'a']--;
            freq['r' - 'a']--;
        }
        while (freq['x' - 'a'] != 0) {
            counter[6]++;
            freq['s' - 'a']--;
            freq['i' - 'a']--;
            freq['x' - 'a']--;
        }
        while (freq['g' - 'a'] != 0) {
            counter[8]++;
            freq['e' - 'a']--;
            freq['i' - 'a']--;
            freq['g' - 'a']--;
            freq['h' - 'a']--;
            freq['t' - 'a']--;
        }
        while (freq['o' - 'a'] != 0) {
            counter[1]++;
            freq['o' - 'a']--;
            freq['n' - 'a']--;
            freq['e' - 'a']--;
        }
        while (freq['t' - 'a'] != 0) {
            counter[3]++;
            freq['t' - 'a']--;
            freq['h' - 'a']--;
            freq['r' - 'a']--;
            freq['e' - 'a']--;
            freq['e' - 'a']--;
        }
        while (freq['f' - 'a'] != 0) {
            counter[5]++;
            freq['f' - 'a']--;
            freq['i' - 'a']--;
            freq['v' - 'a']--;
            freq['e' - 'a']--;
        }
        while (freq['s' - 'a'] != 0) {
            counter[7]++;
            freq['s' - 'a']--;
            freq['e' - 'a']--;
            freq['v' - 'a']--;
            freq['e' - 'a']--;
            freq['n' - 'a']--;
        }
        while (freq['n' - 'a'] != 0) {
            counter[9]++;
            freq['n' - 'a']--;
            freq['i' - 'a']--;
            freq['n' - 'a']--;
            freq['e' - 'a']--;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            while (counter[i] != 0) {
                counter[i]--;
                res.append(i);
            }
        }
        return res.toString();
    }

    // Best Solution
//    static char lookUp[] = {'z','w','x','s','g','u','f','t','o','i'};
//    public String originalDigits(String s) {
//
//        int freq[] = new int[123];
//        int dig[] = new int[10];
//        int len = 0;
//
//        for (char ch : s.toCharArray()) freq[ch]++;
//        for (int i = 0; i < 10; i++)     len += perform(lookUp[i], freq, dig);
//
//        char res[] = new char[len];
//        int idx = 0;
//
//        for (int i = 0; i < 10; i++) {
//            while (dig[i] --> 0) {
//                res[idx++] = (char)('0' + i);
//            }
//        }
//        return new String(res);
//
//    }
//    static int perform(char ch, int freq[], int dig[]) {
//        int cnt = 0;
//
//        if (ch == 'z') {
//            int num = 0;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['z']--; freq['e']--; freq['r']--; freq['o']--;
//            }
//        } else if (ch == 'w') {
//            int num = 2;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['t']--; freq['w']--; freq['o']--;
//            }
//        } else if (ch == 'x') {
//            int num = 6;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['s']--; freq['i']--; freq['x']--;
//            }
//        } else if (ch == 's') {
//            int num = 7;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['s']--; freq['e'] -= 2; freq['v']--; freq['n']--;
//            }
//        } else if (ch == 'g') {
//            int num = 8;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['e']--; freq['i']--; freq['g']--; freq['h']--; freq['t']--;
//            }
//        } else if (ch == 'u') {
//            int num = 4;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['f']--; freq['o']--; freq['u']--; freq['r']--;
//            }
//        } else if (ch == 'f') {
//            int num = 5;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['f']--; freq['i']--; freq['v']--; freq['e']--;
//            }
//        } else if (ch == 't') {
//            int num = 3;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['t']--; freq['h']--; freq['r']--; freq['e'] -= 2;
//            }
//        } else if (ch == 'o') {
//            int num = 1;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['o']--; freq['n']--; freq['e']--;
//            }
//        } else {
//            int num = 9;
//            while (freq[ch] > 0) {
//                cnt++;
//                dig[num]++;
//                freq['n'] -= 2; freq['i']--; freq['e']--;
//            }
//        }
//        return cnt;
//    }
}

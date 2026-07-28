package medium;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate649 {
    public String predictPartyVictory(String senate) {
        int numR = 0;
        int numD = 0;
        int bannedR = 0;
        int bannedD = 0;
        Queue<Character> queue = new LinkedList<>();
        for (char c : senate.toCharArray()) {
            if (c == 'R') {
                numR++;
            } else {
                numD++;
            }
            queue.add(c);
        }
        while (!queue.isEmpty()) {
            if (numR == 0) return "Dire";
            if (numD == 0) return "Radiant";
            char c = queue.poll();
            if (c == 'R') {
                if (bannedR > 0) {
                    bannedR--;
                } else {
                    bannedD++;
                    numD--;
                    queue.add(c);
                }
            } else {
                if (bannedD > 0) {
                    bannedD--;
                } else {
                    bannedR++;
                    numR--;
                    queue.add(c);
                }
            }
        }
        return "";
    }

    // Best solution
//    public String predictPartyVictory(String senate) {
//        return simulateRec(senate.toCharArray(), 0, 0) ? "Radiant" : "Dire";
//    }
//    private static boolean simulateRec(char[] s, int rBan, int dBan) {
//        int r = 0, d = 0;
//        for (int i = 0; i < s.length; i++) {
//            if (s[i] == 'R') {
//                if (dBan > 0) {
//                    dBan--;
//                    s[i] = 0;
//                } else {
//                    r++;
//                    rBan++;
//                }
//            } else if (s[i] == 'D') {
//                if (rBan > 0) {
//                    rBan--;
//                    s[i] = 0;
//                } else {
//                    d++;
//                    dBan++;
//                }
//            }
//        }
//        if (r == 0) return false;
//        if (d == 0) return true;
//        return simulateRec(s, rBan, dBan);
//    }
}

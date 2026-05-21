package medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSquare593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (checkDuplicate(p1, p2, p3, p4)) return false;
        double d12 = distance(p1, p2);
        double d13 = distance(p1, p3);
        double d14 = distance(p1, p4);
        double d23 = distance(p2, p3);
        double d24 = distance(p2, p4);
        double d34 = distance(p3, p4);
        if (d12 == d13) {
            if (d14 == d23 && d12 == d24 && d12 == d34) return true;
            else return false;
        }
        if (d12 == d14) {
            if (d13 == d24 && d12 == d23 && d12 == d34) return true;
            else return false;
        }
        if (d13 == d14) {
            if (d12 == d34 && d13 == d23 && d13 == d24) return true;
            else return false;
        }
        return false;
    }

    public double distance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }

    public boolean checkDuplicate(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        set.add(p1[0] * 10 + p1[1]);
        if (set.contains(p2[0] * 10 + p2[1])) return true;
        else set.add(p2[0] * 10 + p2[1]);
        if (set.contains(p3[0] * 10 + p3[1])) return true;
        else set.add(p3[0] * 10 + p3[1]);
        if (set.contains(p4[0] * 10 + p4[1])) return true;
        else set.add(p4[0] * 10 + p4[1]);
        return false;
    }
}

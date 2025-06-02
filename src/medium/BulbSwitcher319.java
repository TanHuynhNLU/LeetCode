package medium;

public class BulbSwitcher319 {
    public static int bulbSwitch(int n) {
        if (n == 0) return 0;
        int count = 1;
        for (int i = 2; i <= n; i++) {
            if (Math.floor(Math.sqrt(i)) * Math.floor(Math.sqrt(i)) == i) count++;
        }
        return count;
    }
    //Best solution
//    public int bulbSwitch(int n) {
//        return (int) Math.sqrt(n);
//    }
}

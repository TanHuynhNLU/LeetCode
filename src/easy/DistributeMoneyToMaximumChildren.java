package easy;

public class DistributeMoneyToMaximumChildren {
    public static int distMoney(int money, int children) {
        if (money < children) return -1;
        money = money - children;

        int ans = Math.min(money / 7, children);
        int rMoney = money - ans * 7;
        int rChildren = children - ans;

        if (ans == 0) return 0;
        if (rMoney == 3) {
            if (rChildren >= 2) return ans;
            if (rChildren == 1) return ans - 1;
            if (rChildren == 0) return ans - 1;
        }
        if (rMoney > 0) {
            if (rChildren > 0) return ans;
            if (rChildren == 0) return ans - 1;
        }
        return ans;
    }

    //    Best Solution
//    public int distMoney(int m, int c) {
//        int ans = 0, rem, temp;
//        if (m < c)
//            return -1;
//        if (m == c * 8)
//            return c;
//        if (m > c * 8)
//            return c - 1;
//        temp = m - c;
//        ans = temp / 7;
//        rem = temp % 7;
//        if (c - ans == 1 && rem == 3)
//            ans--;
//        return ans;
//    }

    public static void main(String[] args) {
        distMoney(20, 3);
    }
}

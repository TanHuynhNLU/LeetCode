package easy;

public class DistributeCandiesAmongChildrenI2928 {
    public static int distributeCandies(int n, int limit) {
        int res = 0;
        for (int i = 0; i <= limit; i++) {
            if (i > n) break;
            for (int j = 0; j <= limit; j++) {
                if (i + j > n) break;
                for (int k = 0; k <= limit; k++) {
                    if (i + j + k == n) res++;
                    else break;
                }
            }
        }
        return res;
    }

//    public int distributeCandies(int n, int limit) {
//        if (n > 3 * limit) {
//            return 0;
//        }
//        int ans = comb2(n + 2);
//        if (n > limit) {
//            ans -= 3 * comb2(n - limit + 1);
//        }
//        if (n - 2 >= 2 * limit) {
//            ans += 3 * comb2(n - 2 * limit);
//        }
//        return ans;
//    }
//    public static int comb2(int x) {
//        return x * (x - 1) / 2;
//    }
    public static void main(String[] args) {
        distributeCandies(5,2);
    }
}

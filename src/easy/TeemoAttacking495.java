package easy;

public class TeemoAttacking495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if(i>=1&&timeSeries[i]-timeSeries[i-1]<duration)
                count-=duration-timeSeries[i]+timeSeries[i-1];
            count+=duration;
        }
        return count;
//        Best Solution
//        int left = timeSeries[0];
//        int right = timeSeries[0] + duration;
//        int res = 0;
//        for (int i = 1; i < timeSeries.length; i++) {
//            int cur = timeSeries[i];
//            int curEnd = cur + duration;
//            if (right <= cur) {
//                res += right - left;
//                left = cur;
//            }
//            right = curEnd;
//        }
//
//        res += right - left;
//
//        return res;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1,2};
        System.out.println(findPoisonedDuration(timeSeries,2));
    }
}

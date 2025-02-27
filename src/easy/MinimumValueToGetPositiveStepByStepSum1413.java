package easy;

public class MinimumValueToGetPositiveStepByStepSum1413 {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minStart = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            if(sum<minStart) minStart=sum;
        }
        return -minStart+1;
    }
}

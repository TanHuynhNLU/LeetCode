package easy;

public class LargestNumberAtLeastTwiceOfOthers747 {
    public int dominantIndex(int[] nums) {
        int firstMax = -1;
        int secondMax = -1;
        int maxIndex=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>firstMax){
                maxIndex=i;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i]!=firstMax&&nums[i]>secondMax) {
                secondMax=nums[i];
            }
        }
        if(firstMax/2>=secondMax) return maxIndex;
        else return -1;
    }
}

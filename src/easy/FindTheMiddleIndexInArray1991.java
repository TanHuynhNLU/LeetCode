package easy;

public class FindTheMiddleIndexInArray1991 {
    public int findMiddleIndex(int[] nums) {
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }
        if (sumRight == sumLeft) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            sumLeft += nums[i-1];
            sumRight -= nums[i];
            if(sumLeft == sumRight) {return i;}
        }
        if (sumRight == sumLeft) {
            return nums.length-1;
        }
        return -1;
    }
}

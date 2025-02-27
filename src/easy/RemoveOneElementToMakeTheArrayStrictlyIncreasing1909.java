package easy;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing1909 {
    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int i = 1;
        if(nums[0]>=nums[1]){
            if(isIncreasing(nums,0)) return true;
            else {
                count++;
                i++;
            }
        }
        for (; i < nums.length; i++) {
            if(nums[i]<=nums[i-1]){
                if(count==0){
                    if(isIncreasing(nums,i)||isIncreasing(nums,i-1)) {
                        count++;
                        i++;
                    }else {
                        return false;
                    }
                }
                else return false;
            }
        }
        return count <= 1;
    }

    public static boolean isIncreasing(int[] nums, int ignore) {
        int prev =ignore==0?-1:0;
        for (int i = 1; i < nums.length; i++) {
            if (i == ignore) continue;
            if (prev!=-1&&nums[i] <= nums[prev]) return false;
            prev =i;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {100,21,100};
        System.out.println(canBeIncreasing(nums));
    }
}

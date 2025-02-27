package easy;

public class TypeOfTriangle {
    public String triangleType(int[] nums) {
        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (nums[0] + nums[2] <= nums[1]) return "none";
        if (nums[2] + nums[1] <= nums[0]) return "none";
        if (nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) return "isosceles";
        return "scalene";
    }
}

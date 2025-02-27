package easy;

public class RemoveDuplicatesSortedArray26 {
    public static int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 1;
        int unique = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != unique) {
                nums[count] = nums[i];
                count++;
                unique = nums[i];
            }
        }
        return count;
    }

    public static void printArray(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            System.out.println(array[i] + ",");
        }
    }

    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicate(array);
        System.out.println("Length: " + n);
        printArray(array, n);
    }
}

package easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void printArray(int[] array,int k){
        for (int i = 0; i < k; i++) {
            System.out.print(array[i]+",");
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int k = removeElement(nums,2);
        System.out.println("k = "+k);
        printArray(nums,k);
    }
}

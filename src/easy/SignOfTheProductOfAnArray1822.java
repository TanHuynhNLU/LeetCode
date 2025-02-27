package easy;

public class SignOfTheProductOfAnArray1822 {
    public static int arraySign(int[] nums) {
        int negativeNums = 0;
        for (int num : nums) {
            if(num==0) return 0;
            if(num < 0) negativeNums++;
        }
        return negativeNums%2==0?1:-1;
    }

    public static void main(String[] args) {
        arraySign(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24});
        System.out.println(Long.MAX_VALUE);
    }
}

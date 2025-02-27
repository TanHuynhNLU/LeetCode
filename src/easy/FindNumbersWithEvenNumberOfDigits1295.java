package easy;

public class FindNumbersWithEvenNumberOfDigits1295 {
    public int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            if(sb.length()%2==0) count++;
        }
        return count;
//        Best Solution
//        int count = 0;
//        for(int num : nums){
//            if(num / 100000 != 0){
//                count++;
//            }else if(num / 10000 != 0){
//
//            }else if(num / 1000 != 0){
//                count++;
//            }else if(num / 100 != 0){
//
//            }else if(num / 10 != 0){
//                count++;
//            }
//        }
//        return count;
    }
}

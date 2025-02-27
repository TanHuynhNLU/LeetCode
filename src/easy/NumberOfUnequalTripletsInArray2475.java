package easy;

public class NumberOfUnequalTripletsInArray2475 {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[k] != nums[i]) count++;
                }
            }
        }
        return count;
    }

    //    Best Solution
//    public int unequalTriplets(int[] nums) {
//        int trips = 0, pairs = 0, count[] = new int[1001];
//
//        for (int i = 0; i < nums.length; i++) {
//            trips += pairs - count[nums[i]] * (i - count[nums[i]]);
//            pairs += i - count[nums[i]];
//            count[nums[i]] += 1;
//        }
//
//        return trips;
//    }
}

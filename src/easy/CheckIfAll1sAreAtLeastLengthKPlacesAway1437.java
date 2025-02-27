package easy;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 10001;
        for(int i : nums){
            if(i==1){
                if(count<k) return false;
                count=0;
            }else count++;
        }
        return true;
    }
}

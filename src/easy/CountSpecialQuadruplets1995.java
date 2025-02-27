package easy;

public class CountSpecialQuadruplets1995 {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) count++;
                    }
                }
            }
        }
        return count;
//        Best Solution
//        int count=0,l=nums.length;
//        int[] h=new int[301];
//        for(int i=l-2;i>=1;i--){
//            for(int j=i+1;j<l;j++){
//                int p=nums[j]-nums[i];
//                if(p>0)  h[p]++;
//            }
//            for(int j=0;j<i-1;j++){
//                int p=nums[j]+nums[i-1];
//                count+=h[p];
//            }
//        }
//        return count;
    }
}

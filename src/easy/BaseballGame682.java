package easy;

public class BaseballGame682 {
    public static int calPoints(String[] operations) {
        int[] nums = new int[operations.length];
        int count = 0;
        int sum=0;
        for (String s:operations){
            switch (s){
                case "C":
                    count--;
                    sum-=nums[count];
                    break;
                case "D":
                    nums[count] = nums[count-1]*2;
                    sum+=nums[count];
                    count++;
                    break;
                case "+":
                    nums[count] = nums[count-1]+nums[count-2];
                    sum+=nums[count];
                    count++;
                    break;
                default:
                    nums[count]=Integer.parseInt(s);
                    sum+=nums[count];
                    count++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(calPoints(operations));
    }
}

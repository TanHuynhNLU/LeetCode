package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryWatch401 {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        if(turnedOn==0) {
            result.add("0:00");
            return result;
        };
        if(turnedOn>=9) return new ArrayList<>();
        int[] nums = {100,200,400,800,1,2,4,8,16,32};
        boolean[] flags = new boolean[10];
        solve(result,nums,flags,0,0,turnedOn,0);
        return result;
    }
    public static void solve(List<String> result, int[] nums, boolean[] flags ,int sum, int count, int turnedOn, int index){
        if(count==turnedOn){
            String hour ="" +sum/100;
            String min = sum%100<10?"0"+sum%100:""+sum%100;
            result.add(hour+":"+min);
        }else {
            for (int i = index; i < 10; i++) {
                if(flags[i]) continue;
                int tmp = sum+nums[i];
                if(checkValid(tmp)){
                    flags[i] =true;
                    solve(result,nums,flags,tmp,count+1,turnedOn,i);
                    flags[i] =false;
                }
            }
        }
    }
    public static boolean checkValid(int sum){
        if(sum>=1200) return false;
        if(sum%100>59) return false;
        return true;
    }
//  Best solution
//    List<String> result;
//    int[] nums;
//    public List<String> readBinaryWatch(int turnedOn) {
//        result = new ArrayList();
//        nums = new int[] {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
//        traverse(turnedOn, 0, 0, 0);
//        return result;
//    }
//
//    private void traverse(int turnedOn, int hour, int minute, int index) {
//        if (turnedOn == 0) {
//            StringBuilder time = new StringBuilder();
//            time.append(hour).append(":");
//
//            if (minute <= 9) {
//                time.append(0);
//            }
//
//            time.append(minute);
//            result.add(time.toString());
//        }
//
//        for (int i = index; i < 10; ++i) {
//            int nextHour = hour;
//            int nextMinute = minute;
//
//            if (i <= 3) {
//                nextHour += nums[i];
//            } else {
//                nextMinute += nums[i];
//            }
//
//            if (nextHour > 11) {
//                i = 3;
//            } else if (nextMinute > 59) {
//                break;
//            } else {
//                traverse(turnedOn - 1, nextHour, nextMinute, i + 1);
//            }
//        }
//    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(2).size());
    }
}

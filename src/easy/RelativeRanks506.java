package easy;

import java.util.*;

public class RelativeRanks506 {
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] res = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            pQueue.add(score[i]);
            map.put(score[i], i);
        }
        int count = 1;
        for (int i = 0; i < score.length; i++) {
            switch (count) {
                case 1:
                    res[map.get(pQueue.poll())] = "Gold Medal";
                    break;
                case 2:
                    res[map.get(pQueue.poll())] = "Silver Medal";
                    break;
                case 3:
                    res[map.get(pQueue.poll())] = "Bronze Medal";
                    break;
                default:
                    res[map.get(pQueue.poll())] = ""+count;
            }
            count++;
        }
        return res;
//        Best Solution
//        String[] res = new String[nums.length];
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            max = Math.max(max,nums[i]);
//        }
//        int[] arr = new int[max+1];
//        for (int i = 0; i < nums.length; i++) {
//            arr[nums[i]] = i+1;
//        }
//        int count = 1;
//        for (int i = arr.length-1; i >=0 ; i--) {
//            if(arr[i]!=0){
//                if(count==1){
//                    res[arr[i]-1] = "Gold Medal";
//                }else if(count==2){
//                    res[arr[i]-1] = "Silver Medal";
//                }else if(count==3){
//                    res[arr[i]-1] = "Bronze Medal";
//                }else{
//                    res[arr[i]-1] = String.valueOf(count);
//                }
//                count++;
//            }
//        }
//        return res;
    }

    public static void main(String[] args) {
        int[] scores = {5,4,3,2,1};
        String[] res = findRelativeRanks(scores);
        System.out.println(Arrays.toString(res));
    }
}

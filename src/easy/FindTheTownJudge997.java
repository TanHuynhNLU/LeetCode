package easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge997 {
    public static int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean[] flag = new boolean[n + 1];
        for (int i = 0; i < trust.length; i++) {
            flag[trust[i][0]] = true;
            int value = map.getOrDefault(trust[i][1], 0);
            map.put(trust[i][1], value + 1);
        }
        int judge = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n - 1 && flag[entry.getKey()] == false) {
                judge = entry.getKey();
                count++;
            }
        }
        if (count > 1 || judge == 0) return -1;
        else
            return judge;
//        Best solution
//        int[] trustedBy = new int[n+1];
//
//        for(int i = 0; i < trust.length; i++){
//            trustedBy[trust[i][1]]++;//counting no of ppl trusting king
//        }
//        int judge = -1;
//
//        for(int i = 1; i <= n; i++){
//
//            if(trustedBy[i] == n-1){
//                judge = i;
//                break;
//            }
//        }
//
//        for(int i = 0; i < trust.length; i++){
//
//            if(trust[i][0] == judge){
//                judge = -1;
//                break;
//            }
//        }
//
//        return judge;
    }

    public static void main(String[] args) {
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        System.out.println(findJudge(4, trust));
    }
}

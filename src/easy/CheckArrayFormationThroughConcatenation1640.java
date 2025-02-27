package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckArrayFormationThroughConcatenation1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            if(pieces[i].length>1){
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 1; j < pieces[i].length; j++) {
                    list.add(pieces[i][j]);
                }
                map.put(pieces[i][0],list);
            }else {
                map.put(pieces[i][0],null);
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) return false;
            else {
                ArrayList<Integer> list = (ArrayList<Integer>) map.get(arr[i]);
                if(list==null) continue;
                else {
                    for (int j = 0; j <list.size(); j++) {
                        if(arr[++i]!=list.get(j)) return false;
                    }
                }
            }
        }
        return true;
//        Best Solution
//        int[] map = new int[101];
//        for (int i = 0; i < arr.length; i++) {
//            map[arr[i]] = i + 1;
//        }
//        for (int[] piece : pieces) {
//            for (int i = 0; i < piece.length; i++) {
//                if (map[piece[i]] == 0 || map[piece[i]] - map[piece[0]] != i) return false;
//            }
//        }
//        return true;
    }
}

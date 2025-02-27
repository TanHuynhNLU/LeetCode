package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, new ArrayList<>(), target, 0);
        return res;
    }

    public void backtrack(int[] candidates, List<Integer> tmp, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(tmp));
        } else if (target > 0) {
            for (int i = start; i < candidates.length; i++) {
                int newTarget = target - candidates[i];
                tmp.add(candidates[i]);
                backtrack(candidates, tmp, newTarget, i);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

//    Best solution
//List<List<Integer>> res;
//    List<Integer> comb;
//    int[] candidates;
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        return new AbstractList(){
//            @Override
//            public int size(){
//                init();
//                return res.size();
//            }
//
//            @Override
//            public List<Integer> get(int index){
//                init();
//                return res.get(index);
//            }
//
//            public void init(){
//                if(res == null){
//                    res = new ArrayList<>();
//                    comb = new ArrayList<>();
//                    DPS(target, 0);
//                }
//            }
//
//            public void DPS(int target, int curr){
//                if(target == 0){
//                    res.add(new ArrayList<>(comb));
//                    return;
//                }
//
//                if(target<0){
//                    return;
//                }
//
//                for(int i = curr; i < candidates.length; i++){
//                    comb.add(candidates[i]);
//                    DPS(target - candidates[i], i);
//                    comb.remove(comb.size()-1);
//                }
//            }
//        };
//    }
}

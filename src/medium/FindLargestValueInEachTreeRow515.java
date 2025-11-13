package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLargestValueInEachTreeRow515 {
    Map<Integer, Integer> map = new HashMap<>();

    public List<Integer> largestValues(TreeNode root) {
        dfs(root, 0);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            res.add(map.get(i));
        }
        return res;
    }

    public void dfs(TreeNode root, int depth) {
        if (root == null) return;
        if (map.containsKey(depth)) {
            int max = Math.max(root.val, map.get(depth));
            map.put(depth, max);
        } else {
            map.put(depth, root.val);
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

    //Best Solution
//    public void lv(TreeNode root, ArrayList<Integer> ans, int level) {
//        if (root == null) return;
//        if (ans.size() > level) ans.set(level, Math.max(ans.get(level), root.val));
//        else ans.add(root.val);
//        lv(root.left, ans, level + 1);
//        lv(root.right, ans, level + 1);
//    }
//
//    public List<Integer> largestValues(TreeNode root) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        lv(root, ans, 0);
//        return ans;
//    }
}

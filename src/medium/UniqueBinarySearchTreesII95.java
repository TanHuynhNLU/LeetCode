package medium;

import java.util.*;

public class UniqueBinarySearchTreesII95 {
    public List<TreeNode> generateTrees(int n) {
        return allPossibleBST(1, n, new HashMap<>());
    }

    public List<TreeNode> allPossibleBST(int start, int end, Map<Pair, List<TreeNode>> memo) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        if (memo.containsKey(new Pair(start, end))) {
            return memo.get(new Pair(start, end));
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = allPossibleBST(start, i - 1, memo);
            List<TreeNode> right = allPossibleBST(i + 1, end, memo);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(i, l, r);
                    res.add(node);
                }
            }
        }
        memo.put(new Pair(start, end), res);
        return res;
    }
}

class Pair {
    int start;
    int end;

    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return start == pair.start && end == pair.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}

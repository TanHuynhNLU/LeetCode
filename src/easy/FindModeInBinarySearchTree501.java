package easy;


import java.util.*;

public class FindModeInBinarySearchTree501 {
    public static int[] findMode(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        stack.add(root);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.right != null) stack.add(node.right);
            if (node.left != null) stack.add(node.left);

            if (map.containsKey(node.val)) {
                int val = map.get(node.val);
                map.put(node.val, val + 1);
            } else {
                map.put(node.val, 1);
            }

            if (map.get(node.val) > max) {
                max = map.get(node.val);
                set.clear();
                set.add(node.val);
            }
            if (map.get(node.val) == max) {
                set.add(node.val);
            }
        }
        int[] res = new int[set.size()];
        int count = 0;
        for (int i : set){
            res[count++] = i;
        }
        return res;
    }
//    Best Solution
//List<Integer> list = new ArrayList<>();
//    int count = 0;
//    int maxCount = 0;
//    TreeNode pre = null;
//    private void inorder(TreeNode root){
//        if(root == null) return;
//        inorder(root.left);
//        if(pre == null) count = 1;
//        else if(pre.val == root.val){
//            count++;
//        }else if(pre.val != root.val){
//            count = 1;
//        }
//        if(maxCount == count){
//            list.add(root.val);
//        }else if(count > maxCount){
//            list.clear();
//            maxCount = count;
//            list.add(root.val);
//        }
//        pre = root;
//        inorder(root.right);
//    }
//
//    private int[] listToArray(List<Integer> l){
//        int[] nums = new int[l.size()];
//        for(int i=0;i<l.size();i++){
//            nums[i] = l.get(i);
//        }
//        return nums;
//    }
//
//    public int[] findMode(TreeNode root) {
//        inorder(root);
//        return listToArray(list);
//    }

}

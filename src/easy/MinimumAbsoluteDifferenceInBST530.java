package easy;

import java.util.PriorityQueue;

public class MinimumAbsoluteDifferenceInBST530 {
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        PriorityQueue<Integer> pQueue = new PriorityQueue();
        preorder(root,pQueue);
        int prev = -1;
        while (pQueue.size()!=0){
            int val = pQueue.poll();
            if(prev==-1) {
                prev = val;
                continue;
            }
            if(val-prev<min){
                min = val-prev;
            }
            prev = val;
        }
        return min;
    }
    public void preorder(TreeNode root,PriorityQueue<Integer> pQueue){
        if(root==null) return;
        pQueue.add(root.val);
        preorder(root.left,pQueue);
        preorder(root.right,pQueue);
    }
//    Best solution
//    int min = Integer.MAX_VALUE;
//    Integer prev = null;
//    public int getMinimumDifference(TreeNode root) {
//        if(root == null) return min;
//        getMinimumDifference(root.left);
//
//        if(prev!= null){
//            min = Math.min(min, Math.abs(root.val - prev));
//        }
//        prev = root.val;
//        getMinimumDifference(root.right);
//
//        return min;
//    }
}

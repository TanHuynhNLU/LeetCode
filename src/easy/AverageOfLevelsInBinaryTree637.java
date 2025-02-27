package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree637 {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int l = 0;
        int[] level = new int[10000];
        level[0] = 1;
        int count = 0;
        double sum = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            sum += node.val;
            count++;
            if (node.left != null) {
                queue.add(node.left);
                level[l+1]++;
            }
            if (node.right != null) {
                queue.add(node.right);
                level[l+1]++;
            }
            if (count == level[l]) {
                res.add( sum / count);
                sum = 0;
                count = 0;
                l++;
            }
        }
        return res;
//        Best solution
//        public List<Double> averageOfLevels(TreeNode root) {
//            List<Double> averages = new ArrayList<>();
//
//            List<TreeNode> levelComponents = new ArrayList<>();
//            levelComponents.add(root);
//            int level = 0;
//            computeAverage(levelComponents, averages, 0);
//            return averages;
//
//        }
//
//        public void computeAverage(List<TreeNode> levelComponents, List<Double> averages, int level){
//            if(levelComponents.size() == 0){
//                return;
//            }
//            List<TreeNode> nextLevelComponents = new ArrayList<>();
//            double sum = 0;
//            for(int i=0; i < levelComponents.size(); i++){
//                sum+=levelComponents.get(i).val;
//                if(levelComponents.get(i).left != null){
//                    nextLevelComponents.add(levelComponents.get(i).left);
//                }
//                if(levelComponents.get(i).right != null){
//                    nextLevelComponents.add(levelComponents.get(i).right);
//                }
//            }
//
//            averages.add(sum/levelComponents.size());
//
//            level ++;
//            computeAverage(nextLevelComponents, averages, level);
//        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        n1.left=n2;
        n1.right=n3;
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n3.left =n4;
        n3.right = n5;
        averageOfLevels(n1);
    }
}

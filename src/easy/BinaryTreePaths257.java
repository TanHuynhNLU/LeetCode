package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root.left==null&&root.right==null) result.add(""+root.val);
        treePaths(root.left,result,""+root.val);
        treePaths(root.right,result,""+root.val);
        return result;
    }

    public static void treePaths(TreeNode root,List<String> result, String s) {
        if (root==null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;

        s+="->"+root.val;

        if(left==null&&right==null){
            result.add(s);
            return;
        }
        if(left!=null){
           treePaths(left,result,s);
        }
        if(right!=null){
            treePaths(right,result,s);
        }
    }

    //Best solution
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res = new ArrayList<>();
//        dfs(root, new StringBuilder(), res);
//        return res;
//    }
//
//    private void dfs(TreeNode node, StringBuilder sb, List<String> res) {
//        if (node == null) return;
//        int c = sb.length();
//        if (!sb.isEmpty()) {
//            sb.append("->");
//        }
//        sb.append(node.val);
//
//        if (node.left == null && node.right == null) {
//            res.add(sb.toString());
//        }
//        dfs(node.left, sb, res);
//        dfs(node.right, sb, res);
//
//        sb.delete(c, sb.length());
//    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(6);
        n1.left = n2;
        n1.right = n3;
        n2.left = n5;
        n2.right = n4;

        List<String> result = binaryTreePaths(n1);

        System.out.println(result.toString());
    }
}

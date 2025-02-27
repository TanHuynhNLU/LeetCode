package easy;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeInorder94 {
    public static List<Integer>inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(result,root);
        return result;
    }
    public static void inorder(List<Integer>result ,TreeNode node){
        if(node==null) return;
        inorder(result,node.left);
        result.add(node.val);
        inorder(result,node.right);
    }

    public static void main(String[] args) {
    }
}

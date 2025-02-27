package easy;

public class ConstructStringFromBinaryTree606 {
    public String tree2str(TreeNode root) {
        StringBuilder res = new StringBuilder();
        traversal(root,res);
        return res.substring(1,res.length()-1);
    }
    public static void traversal(TreeNode root, StringBuilder res){
        if(root==null) return;
        res.append('(').append(root.val);
        if(root.left==null&&root.right!=null) res.append("()");
        traversal(root.left,res);
        traversal(root.right,res);
        res.append(')');
    }
}

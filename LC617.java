public class LC617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode root = t1;
        helper(t1,t2,root);
        return root;
    }
    public void helper(TreeNode t1,TreeNode t2,TreeNode root){
        if (t1==null && t2==null)
            return;
        else if (t1==null && t2 != null)
            root = t2;
        else if (t2==null && t1!=null)
            root = t1;
        else
            root.val = t1.val + t2.val;
        helper(t1.left,t2.left,root.left);
        helper(t1.right,t2.right,root.right);


    }



    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }
}

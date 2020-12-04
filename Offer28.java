public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return s(root.left,root.right);
    }
    public boolean s(TreeNode left,TreeNode right){
        if (left == null && right==null){
            return true;
        }
        if (left==null || right==null||left.val != right.val){
            return false;
        }

        return s(left.left,right.right)&&s(left.right,right.left);
    }


}

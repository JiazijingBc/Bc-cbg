public class LC226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null){
            TreeNode a = root.left;
            root.left = root.right;
            root.right = a;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}

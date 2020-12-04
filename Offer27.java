public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode a = new TreeNode(0);
        a = root.left;
        root.left = root.right;
        root.right = a;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

}

import java.util.Arrays;

public class Offer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder);
    }
    public TreeNode helper(int[] preorder, int[] inorder){
        if(preorder.length==0)return null;
        int head = preorder[0];
        System.out.println(head);
        TreeNode root = new TreeNode(head);
        int flag = 0;
        while (flag<preorder.length && inorder[flag]!=head){
            flag++;
        }
        root.left = helper(Arrays.copyOfRange(preorder,1,1+flag),Arrays.copyOfRange(inorder,0,flag));
        root.right = helper(Arrays.copyOfRange(preorder,1+flag,preorder.length),Arrays.copyOfRange(inorder,1+flag,inorder.length));
        return root;
    }

    public static void main(String[] args) {
        Offer07 offer07 = new Offer07();
        offer07.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
    }
}



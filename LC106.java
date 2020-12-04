import java.util.Arrays;

public class LC106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int num = postorder[postorder.length-1];
        TreeNode treeNode = new TreeNode(num);
        int flag = 0;
        for(int i = 0;i<inorder.length;i++){
            if (inorder[i] == num){
                flag = i;
            }
        }
        treeNode.left =  buildTree(Arrays.copyOfRange(inorder,0,flag),Arrays.copyOfRange(inorder,0,flag));
        treeNode.left =  buildTree(Arrays.copyOfRange(postorder,flag+1,postorder.length),Arrays.copyOfRange(postorder,flag,postorder.length-1));
        return treeNode;
    }


}

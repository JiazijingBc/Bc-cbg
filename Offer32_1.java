
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Offer32_1 {
    public int[] levelOrder(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList(){
            { add(root); }
        };
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            ans.add(treeNode.val);
            if(treeNode.left !=null) queue.add(treeNode.left);
            if(treeNode.right !=null) queue.add(treeNode.right);
        }


        int [] res = new int[ans.size()];
        for (int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}

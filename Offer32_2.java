import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        Queue<TreeNode> queue = new LinkedList(){
            { add(root); }
        };
        ArrayList<List<Integer>> ans = new ArrayList<>();

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode treeNode = queue.poll();
                tmp.add(treeNode.val);
                if(treeNode.left !=null) queue.add(treeNode.left);
                if(treeNode.right !=null) queue.add(treeNode.right);
            }

            ans.add(tmp);

        }
        return ans;
    }

}

import java.util.*;

public class Offer32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        LinkedList<TreeNode> queue = new LinkedList(){
            { add(root); }
        };
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int j = 0;
        while (!queue.isEmpty()){

                int size = queue.size();
                LinkedList<Integer> tmp = new LinkedList<>();
                for(int i=0;i<size;i++){
                    TreeNode treeNode = queue.poll();
                    if (j%2==0)tmp.addFirst(treeNode.val);
                    else tmp.addLast(treeNode.val);
                    if(treeNode.left !=null) queue.add(treeNode.left);
                    if(treeNode.right !=null) queue.add(treeNode.right);
                }
                ans.add(tmp);
                j+=1;

        }
        return ans;
    }
}

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LC113 {
        List<List<Integer>> ans = new LinkedList<>();
        Deque<Integer> res = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        dfs(root,sum);

        return ans;
    }
    public void dfs(TreeNode root,int sum){
        if(root == null)
            return;

        sum -= root.val;
        if(sum >=0){
            res.addLast(root.val);
        }else return;
        if (sum==0 && root.left==null && root.right==null){
            ans.add(new LinkedList<Integer>(res));
        }
        dfs(root.left,sum);
        dfs(root.right,sum);
        res.removeLast();
    }
}

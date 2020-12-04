import java.util.ArrayList;
import java.util.List;

public class LC257 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        if(root==null)return ans;
        helper(root,"",ans);
        return ans;
    }
    public void helper(TreeNode root,String a,List<String> res){
        if (root==null) return;
        a += root.val;
        if(root.right == null && root.left == null){

            res.add(a);
        }
        else {
            a += "->";
            helper(root.left,a,res);
            helper(root.right,a,res);
        }
    }
}

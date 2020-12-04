import java.util.LinkedList;
import java.util.List;

public class LC129 {
    public int ans = 0;
    public int sumNumbers(TreeNode root) {
        if (root==null) return 0;
        List<TreeNode> nodes = new LinkedList<>();
        helper(root,nodes);
        return ans;
    }
    public void helper(TreeNode root,List<TreeNode> nodes){
        if (root==null) return;
        if (root.left==null && root.right == null) {
            nodes.add(root);
            String res = "";
            for (int i = 0; i < nodes.size(); i++) {
                res += Integer.toString(nodes.get(i).val);
            }
            ans += Integer.parseInt(res);
            nodes.remove(root);
            return;
        }
        nodes.add(root);
        helper(root.left,nodes);
        helper(root.right,nodes);
        nodes.remove(root);
    }
}

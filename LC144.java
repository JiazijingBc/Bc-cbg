import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    public void helper(TreeNode root,List<Integer> ans){
        if (root == null)return;
        ans.add(root.val);
        helper(root.left,ans);
        helper(root.right,ans);
    }


    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null){
            while (node != null){
                stack.push(node);
                node = node.left;
                ans.add(node.val);
            }
            node = stack.pop();
            node = node.right;
        }
        return ans;
    }
}

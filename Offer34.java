import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer34 {
    ArrayList<List<Integer>> ans = new ArrayList<>();
    LinkedList arrayList = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root, sum, 0);
        return ans;
    }
    void helper(TreeNode root,int sum,int sum_a){
        if(root==null)return;
        arrayList.add(root.val);
        if(sum_a + root.val == sum && root.left == null && root.right == null){
            ans.add(new LinkedList(arrayList));
        }
        helper(root.left,sum,sum_a+root.val);
        helper(root.right,sum,sum_a+root.val);
        arrayList.removeLast();
    }
}

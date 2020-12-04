import java.util.ArrayList;
import java.util.HashMap;

public class LC501 {
    int preVal = 0, curTimes = 0, maxTimes = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        helper(root);
        int size = list.size();
        int[] ints = new int[size];
        for (int i =0;i<size;i++){
            ints[i] = list.get(i);
        }
        return ints;
    }
    public void helper(TreeNode root){
        if (root == null){
            return;
        }
        helper(root.left);
        if (preVal == root.val){
            curTimes ++;
        }else{
            preVal = root.val;
            curTimes = 1;
        }
        if (curTimes == maxTimes){
            list.add(root.val);
        }else if(curTimes>maxTimes){
            list.clear();
            list.add(root.val);
            maxTimes = curTimes;
        }
        helper(root.right);
    }
}

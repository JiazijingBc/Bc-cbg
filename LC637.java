import java.util.ArrayList;
import java.util.List;

public class LC637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        List<Double> sums = new ArrayList<Double>();
        dfs(root,sums,count,0);

        List<Double> ans = new ArrayList<>();
        for (int i = 0;i<sums.size();i++){
            ans.add(sums.get(i)/count.get(i));
        }
        return ans;
    }
    public void dfs(TreeNode root,List<Double> sums,List<Integer> counts,int level){
        if(root==null){
            return;
        }
        if (level<sums.size()){
            sums.set(level, sums.get(level) + root.val);
            counts.set(level, counts.get(level) + 1);

        }else {
            sums.add(1.0 * root.val);
            counts.add(1);
        }
        dfs(root.left, sums, counts, level + 1);
        dfs(root.right, sums, counts, level + 1);
    }
}

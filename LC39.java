import java.util.ArrayList;
import java.util.List;

public class LC39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(candidates,target,0,ans,res);

        return ans;
    }
    public void helper(int[] nums,int target,int i,List<List<Integer>> ans,List<Integer> res){
        if(target<0 || i==nums.length){
            return;
        }else if (target==0){
            ans.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[i]);
        helper(nums,target-nums[i],i,ans,res);
        res.remove(Integer.valueOf(nums[i]));
        helper(nums,target,i+1,ans,res);
    }

    public static void main(String[] args) {
        LC39 lc39 = new LC39();
        System.out.println(lc39.combinationSum(new int[]{2,3,5},8));
    }
}

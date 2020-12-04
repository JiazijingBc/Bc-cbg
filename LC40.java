import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,ans,res);

        return ans;
    }
    public void helper(int[] nums,int target,int i,List<List<Integer>> ans,List<Integer> res) {

        if(target<0){
            return;
        }else if (target==0){
            ans.add(new ArrayList<>(res));
            return;
        }else if(i==nums.length && target>0){
            return;
        }
        if(target-nums[i]>=0){
            res.add(nums[i]);
            helper(nums,target-nums[i],i+1,ans,res);
            res.remove(Integer.valueOf(nums[i]));
        }
        for(int k = i+1;k<nums.length;k++){
            if(nums[k]!=nums[i]){
                helper(nums,target,k,ans,res);
                break;
            }
        }
    }
    public static void main(String[] args) {
        LC40 lc40 = new LC40();
        System.out.println(lc40.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
}

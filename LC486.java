import java.util.Arrays;

public class LC486 {


    public boolean PredictTheWinner(int[] nums) {
        if(nums==null) return false;
        int i = 0;
        int j = nums.length-1;
        int flag = 1;
        return helper(nums,i,j,flag) >= 0;
    }
    public int helper(int[] nums,int i,int j,int flag){
        if (i == j){
            return nums[i] * flag;
        }
        int ScoreStart = nums[i]*flag + helper(nums,i+1,j,-flag);
        int ScoreEnd = nums[j]*flag + helper(nums,i,j-1,-flag);


        return Math.max(ScoreStart*flag,ScoreEnd*flag)*flag;
    }
}

public class LC34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1,-1};
        int i = 0;
        int j = nums.length - 1;
        while (i<=j){
            if (nums[i]==target && nums[j]==target){
                ans[0] = i;
                ans[1] = j;
                break;
            }
            if (nums[i]<target){
                i++;
            }
            if (nums[j]>target){
                j--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LC34 lc34 = new LC34();
        for (int i : lc34.searchRange(new int[]{5, 7, 7, 7, 8, 8, 10}, 8)) {
            System.out.println(i);
        }
    }
}

public class LC35 {
    public int searchInsert(int[] nums, int target) {

        int ans =0;
        for (int i=0;i<nums.length;i++){

            if (nums[i]==target){
                ans = i;
                break;
            }
            if (nums[i]>target){
                ans=i;
                break;
            }
            if(i==nums.length-1){
                ans = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LC35 lc35 = new LC35();
        int[] nums = {1,3,5,6};
        System.out.println(lc35.searchInsert(nums, 7));
    }
}

public class LC75 {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int cur = 0;
        while (cur<r){

            if (nums[cur] == 0){
                int a = nums[l];
                nums[l] = nums[cur];
                nums[cur] = a;
                l++;
                cur++;
            }else if (nums[cur] == 2){
                int a = nums[r];
                nums[r] = nums[cur];
                nums[cur] = a;
                r--;
            }else{
                cur++;
            }
        }
    }
}

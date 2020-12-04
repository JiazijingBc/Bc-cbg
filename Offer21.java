public class Offer21 {
    public int[] exchange(int[] nums) {
        int fast = 0,slow = 0;
        while (fast != nums.length){
            int tmp = 0;
            if (nums[fast] % 2 == 1 && nums[slow] % 2 == 0){
                tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow += 1;
            }
            if (nums[slow] % 2 == 1){
                slow += 1;
            }
            fast += 1;
        }
        return nums;
    }
}

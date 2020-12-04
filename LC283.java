public class LC283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast<nums.length){
            if (nums[fast]!=0){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }else {
                fast++;
            }
        }
        while (slow<nums.length){
            nums[slow] = 0;
            slow++;
        }
    }
    public static void main(String[] args) {
        LC283 lc283 = new LC283();
        int[] ints = {0, 1, 0, 3, 12};
        lc283.moveZeroes(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

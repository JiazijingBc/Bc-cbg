import java.util.Arrays;

public class LC1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] flag = new int[101];
        for (int num : nums) {
            flag[num] ++ ;
        }
        for (int i = 0; i < nums.length; i++) {
            int res = 0;
            for (int i1 = 0; i1 < nums[i]; i1++) {
                res += flag[i1];
            }
            nums[i] = res;
        }
        return nums;
    }

    public static void main(String[] args) {
        LC1365 lc1365 = new LC1365();
        int[] ints = lc1365.smallerNumbersThanCurrent(new int[]{7,7,7,7});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

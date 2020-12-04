import java.util.Arrays;

public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        int[] ints = new int[nums.length];
        Arrays.fill(ints,0);
        for (int num : nums) {
            ints[num] += 1;
        }
        for(int i =0;i<ints.length;i++){
            if(ints[i]>1){
                return i;
            }
        }
    return 0;
    }
}

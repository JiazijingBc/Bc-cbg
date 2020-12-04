import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LC53 {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int add = 0;
        for (int i = 0; i < nums.length; i++) {
            if (add<=0){
                add = nums[i];
            }else {
                add += nums[i];
            }

            max = Math.max(max,add);

        }
        return max;
    }

    public static void main(String[] args) {
        Integer a1 = new Integer(10);
        Integer a2 = new Integer(10);
        Integer a3 = new Integer(100);
        Integer a4 = new Integer(100);
        System.out.println(a1.equals(a2));
        System.out.println(a3 == a4);
    }
}

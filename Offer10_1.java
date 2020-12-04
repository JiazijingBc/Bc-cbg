import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Offer10_1 {

    public int fib1(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }


    public static void main(String[] args) {
        Offer10_1 offer10_1 = new Offer10_1();
        System.out.println("fib1 = " + offer10_1.fib1(5));

    }
}

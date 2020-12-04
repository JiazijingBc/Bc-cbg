public class LC96 {
    int ans = 0;
    int res = 0;
    public int numTrees(int n) {
        if(n==0){
            return 0;
        }

            ans = helper(1,n);

        return ans;
    }
    public int helper(int a,int b){

        if(a==b) return 1;
        if((b-a)==1) return 2;
        for (int i = a;i<=b;i++){
            if (i==a){
                res += helper(i+1,b);
            }
            else if(i==b){
                res += helper(a,i-1);
            }
            else {
                res +=  helper(a,i-1) * helper(i+1,b);
            }
        }
        return res;
    }
    public int numTrees2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        LC96 solution = new LC96();
        System.out.println(solution.numTrees(3));
        System.out.println(solution.numTrees2(3));
    }
}

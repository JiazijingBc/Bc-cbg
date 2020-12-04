public class LC122 {
public int maxProfit(int[] prices) {
    int count = 0;
    for (int i = 0; i < prices.length-1; i++) {
        if (prices[i]<prices[i+1]){
            count += prices[i+1]-prices[i];
        }
    }
    return count;

}

    public static void main(String[] args) {
        LC122 lc122 = new LC122();
        System.out.println(lc122.maxProfit(new int[]{1,2,3,4,5}));
    }
}

public class LC134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = gas[i]-cost[i];
        }
        for (int i = 0; i < N; i++) {
            if (a[i] >= 0){
                int flag = helper(a,i);
                if (flag!=-1){
                    return flag;
                };
            }
        }
        return -1;
    }
    public int helper(int[] a,int i){
        int N = a.length;
        int res = 0;
        for (int j = i; j < N; j++) {
            res += a[j];
            if (res<0){
                return -1;
            }
        }
        for(int j =0;j<i;j++){
            res += a[j];
            if (res<0){
                return -1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        LC134 lc134 = new LC134();
        System.out.println(lc134.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }
}

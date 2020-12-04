import java.util.HashMap;
import java.util.Map;

public class LC454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int ans = 0;
        Map<Integer,Integer> ab =  new HashMap<Integer,Integer>();
        Map<Integer,Integer> cd =  new HashMap<Integer,Integer>();
        for (int i : A) {
            for (int j : B) {
                int res = i + j;
                if (ab.containsKey(res)){
                    Integer integer = ab.get(res);
                    integer ++;
                    ab.replace(res,integer);
                }else {
                    ab.put(res,1);
                }
            }
        }
        for (int m : C) {
            for (int n : D) {
                int res = m + n;
                if (ab.containsKey(-res)){
                    ans += ab.get(-res);
                }
            }
        }
        return ans;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int max = Math.max(r0,R-r0-1)+Math.max(c0,C-c0-1);
        ArrayList<List<int[]>> ans = new ArrayList<List<int[]>>();
        for (int i = 0; i <= max; i++) {
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                int len = 0;
                len = Math.abs(i - c0) + Math.abs(j-r0);
                ans.get(len).add(new int[]{j,i});
            }
        }
        int[][] ans1 = new int[R * C][];
        int flag = 0;
        for (int i = 0; i < max; i++) {
            for (int[] ints2 : ans.get(i)) {
                ans1[flag] = ints2;
                flag++;
            }
        }
        return ans1;
    }
}

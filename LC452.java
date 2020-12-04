import java.util.Arrays;
import java.util.Comparator;

public class LC452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length==0)return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]>o2[1]){
                    return 1;
                }else if (o1[1]<o2[1]){
                    return -1;
                }else return 0;
            }
        });
        int ans = 1;
        int flag = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0]>flag){
                ans++;
                flag = points[i][1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LC452 lc452 = new LC452();
        System.out.println(lc452.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));
    }
}

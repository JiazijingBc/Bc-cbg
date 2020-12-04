import java.util.Arrays;
import java.util.Comparator;

public class LC435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length==0)return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]-o2[1]<0){
                    return -1;
                }else if (o1[1]-o2[1]>0){
                    return 1;
                }else {
                    if (o1[0]-o2[0]<0){
                        return -1;
                    }else if (o1[0]-o2[0]>0){
                        return 1;
                    }else return 0;
                }
            }
        });
        int end = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (end>intervals[i][0]){
                ans++;
            }
            else {
                end = intervals[i][1];
            }
        }
        return ans;
    }
}

import java.util.*;

public class LC973 {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        for (int i = 0; i < K; i++) {
            pq.add(new int[]{points[i][0]*points[i][0]+points[i][1]*points[i][1],i});
        }
        for (int i=K;i<points.length;i++){
            int res = 0;
            res = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            if (res<pq.peek()[0]){
                pq.poll();
                pq.add(new int[]{res,i});
            }
        }
        int[][] ints = new int[K][2];
        for (int i = 0; i < K; i++) {
            ints[i] = points[pq.poll()[1]];
        }
        return ints;
    }
}

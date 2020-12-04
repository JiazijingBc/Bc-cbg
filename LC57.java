import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

public class LC57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0){
            return new int[][]{newInterval};
        }
        int first = newInterval[0];
        int last = newInterval[1];
        int flag = 1;
        List<int[]> ansList = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; i++) {
            if (first>intervals[i][1]){
                ansList.add(intervals[i]);
            } else if (last<intervals[i][0]){
                if (flag == 1){
                    ansList.add(newInterval);
                    ansList.add(intervals[i]);
                    flag = 0;
                }else {
                    ansList.add(intervals[i]);
                }

            }else if (first>=intervals[i][0] && last<=intervals[i][1]){
                ansList.add(intervals[i]);
                flag = 0;
            }else if (first < intervals[i][0] && last >= intervals[i][0]){
                for (int j = i;j<intervals.length;j++){
                    if (last<intervals[j][1]&&last>=intervals[j][0]){
                        ansList.add(new int[]{first,intervals[j][1]});
                        i = j;
                        flag = 0;
                        break;
                    }else if(last<intervals[j][0]){
                        ansList.add(newInterval);
                        i = j-1;
                        flag = 0;
                        break;
                    }
                }
            }else if (first<=intervals[i][1] && last>intervals[i][1]){

                for (int j = i;j<intervals.length;j++){
                    if (last<intervals[j][1]&&last>=intervals[j][0]){
                        ansList.add(new int[]{intervals[i][0],intervals[j][1]});
                        i = j;
                        flag = 0;
                        break;
                    }else if(last<=intervals[j][0]){
                        ansList.add(new int[]{intervals[i][0],last});
                        i = j-1;
                        flag = 0;
                        break;
                    }else if(j == intervals.length-1){
                        ansList.add(new int[]{intervals[i][0],last});
                        i = j;
                        flag = 0;
                        break;
                    }
                }
            }
        }
        if (flag == 1){
            ansList.add(newInterval);
        }
        int[][] ans = new int[ansList.size()][2];
        int i =0;
        for (int[] ints : ansList) {
            ans[i] = ints;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        LC57 lc57 = new LC57();
//        int[][] insert = lc57.insert(new int[][]{{1,2},{3,5},{6,7},{8,10},{12,16}}, new int[]{4, 8});
        int[][] insert = lc57.insert(new int[][]{{1,5}}, new int[]{0,1});
        for (int[] ints : insert) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}

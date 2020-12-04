import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class LC406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }

            }
        });
        int [][] ans = new int[people.length][];
        for (int[] person : people) {
            int flag = person[1];

//            System.out.println(flag);
            for (int i = 0;i< people.length;i++){
//                System.out.println("======>"+i);
//                System.out.println(flag);
                if (flag==0 && ans[i]==null){
//                    System.out.println(i);
                    ans[i] = person;
                    break;
                }else if (flag==0 && ans[i] != null){
                    continue;
                }

                if (ans[i] == null){
                    flag--;
                }else if (ans[i][0] == person[0]){
                    flag--;
                }

            }


        }
        return ans ;
    }

    public static void main(String[] args) {
        LC406 lc406 = new LC406();
        lc406.reconstructQueue(new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});
    }
}

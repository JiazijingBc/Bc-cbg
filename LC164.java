public class LC164 {
    public int maximumGap(int[] nums) {
        int len = nums.length;
        if (len <2)return 0;
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num>max){
                max = num;
            }
            if (num<min){
                min = num;
            }
        }
        if (max == min){
            return 0;
        }
        int t_len = (max-min)/(len - 1);
//        System.out.println(t_len);
        int t_n=0;
        if (t_len != 0){
            t_n = (max-min)/t_len + 1;
        }else {
            t_n = len;
        }

        int[]t_min = new int[t_n];
        int[]t_max = new int[t_n];
        for (int num : nums) {
            int a ;
            if (t_len != 0){
                a = num/t_len;
            }else {
                a = num;
            }

            if (t_max[a]==0){
                t_max[a] = num;
            }else {
                if (t_max[a]<num) t_max[a]=num;
            }
            if (t_min[a]==0){
                t_min[a] = num;
            }else {
                if (t_min[a] > num) t_min[a]=num;
            }
        }
        int i = 0;
        int ans = 0;
        while (i < t_n-1){
            int res = 0;

            int a = i;
            if (t_max[i+1] != 0){
                res = t_min[i+1] - t_max[a];
            }else {
                while (i < t_n-1 && t_max[i+1] == 0){
                    System.out.println(i);
                    i++;
                }
                res = t_min[i] - t_max[a];
//                System.out.println(res);
            }
            if (res > ans) ans = res;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        LC164 lc164 = new LC164();
        System.out.println(lc164.maximumGap(new int[]{1,1,1,1,1,5,5,5,5,5}));
    }
}

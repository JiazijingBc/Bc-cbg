import java.util.ArrayList;
import java.util.List;

public class LC763 {
    public List<Integer> partitionLabels(String S) {
        if (S == null || S.length() == 0) {
            return null;
        }
        int left = 0;
        int right = S.length()-1;
        List<Integer> ans = new ArrayList<>();
        int flag = 0;
        while (left<=flag){
            int res = right;
            while (S.charAt(left) != S.charAt(res)){
                res--;
            }
            if(res == right){
                ans.add(res+1);
                break;
            }
            if(res>flag){
                flag = res;
            }

            if(left == flag){
                ans.add(left+1);
                S = S.substring(left + 1);
                left = 0;
                flag = 0;
                right = S.length()-1;
            }else {
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";
        LC763 lc763 = new LC763();
        System.out.println(lc763.partitionLabels(S));
    }
}

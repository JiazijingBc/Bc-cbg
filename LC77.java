import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(1,n,k,ans,res);
        return ans;
    }
    public void helper(int begin,int n,int k,List<List<Integer>> ans,List<Integer> res){

        if(k == 0){
            System.out.println(res);
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i = begin;i <= n;i++){
            res.add(i);
            helper(i+1,n,k-1,ans,res);
            res.remove(Integer.valueOf(i));
        }

    }
    public static void main(String[] args) {
        LC77 lc77 = new LC77();
        lc77.combine(4,2);
    }
}
